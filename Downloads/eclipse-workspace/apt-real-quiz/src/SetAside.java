import java.util.*;
public class SetAside {
    public String common(String[] list) {
    	HashSet<String> common = new HashSet<>();
    	for (int i = 0; i < list.length; i++) {
        	String[] split = list[i].split(" ");
        	for (String s: split){
        		common.add(s);
        	}
    	}
        for (String s: list) {
        	List<String> check = Arrays.asList(s.split(" "));
        	common.retainAll(check);
        }
        List<String> inCommon = new ArrayList<>(common);
        Collections.sort(inCommon);
        if (inCommon.size() > 0) {
        	String commonString = inCommon.get(0);
        	for (int j = 1; j < inCommon.size(); j++) {
        		commonString = commonString + " " + inCommon.get(j);
        	}
        	return commonString;
        }
    	return "";
    }
}


