import java.util.*;
public class ValidAddresses {
	ArrayList<String> myList = new ArrayList<>();
	int posLength;
    public String[] valid(String possible){
    	posLength = possible.length();
    	String[] parts = new String[4];
    	helper(possible, 0, parts);
    	Collections.sort(myList);
    	return myList.toArray(new String[0]);
    }
    
	private void helper(String pos, int index, String[] parts) {
		if (index > parts.length - 1) {
			int count = 0;
			for (int j = 0; j < parts.length; j++) {
				count += parts[j].length();
			}
			if (count == posLength) {
			String quad = String.join(".", parts);
				myList.add(quad);
			}
		}
		else if (pos.length() >= 3) {
			String q1 = pos.substring(0,1);
			String q2 = pos.substring(0,2);
			String q3 = pos.substring(0,3);
			if (dottedQuadOk(q1)) {
				parts[index] = q1;
				helper(pos.substring(1), index + 1, parts);
			}
			if (dottedQuadOk(q2)) {
				parts[index] = q2;
				helper(pos.substring(2), index + 1, parts);
			}
			if (dottedQuadOk(q3)) {
				parts[index] = q3;
				helper(pos.substring(3), index + 1, parts);
			}
		}
		else if (pos.length() == 2){
			String q1 = pos.substring(0,1);
			String q2 = pos.substring(0,2);
			if (dottedQuadOk(q1)) {
				parts[index] = q1;
				helper(pos.substring(1), index + 1, parts);
			}
			if (dottedQuadOk(q2)) {
				parts[index] = q2;
				helper(pos.substring(2), index + 1, parts);
			}
		}
		else if (pos.length() == 1) {
			String q1 = pos.substring(0,1);
			if (dottedQuadOk(q1)) {
				parts[index] = q1;
				helper(pos.substring(1), index + 1, parts);
			}
		}

	}
	
	private boolean dottedQuadOk(String q) {
		if (q.substring(0, 1).equals("0") && q.length() > 1) {
			return false;
		}
		if (Integer.parseInt(q) > 255) {
			return false;
		}
		else {
			return true;
		}
	}

}
