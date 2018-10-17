import java.util.*;

public class MemberCheck {
	public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
		Set<String> visitors1 = new HashSet<>(Arrays.asList(club1));
		Set<String> visitors2 = new HashSet<>(Arrays.asList(club2));
		Set<String> visitors3 = new HashSet<>(Arrays.asList(club3));
		Set<String> temp1 = new HashSet<>(visitors1);
		
		visitors1.retainAll(visitors2);
		temp1.retainAll(visitors3);
		visitors2.retainAll(visitors3);
		List<String> dishonest = new ArrayList<>();
		dishonest.addAll(visitors1);
		dishonest.addAll(temp1);
		dishonest.addAll(visitors2);
		
		for (int i = 0; i < dishonest.size(); i++) {
			String temp = dishonest.get(i);
			for (int j = i + 1; j < dishonest.size(); j++) {
				if (temp.charAt(0) > dishonest.get(j).charAt(0)) {
					dishonest.set(i, dishonest.get(j));
					dishonest.set(j, temp);
				}
			}
		}
		String[] dishonestMembers = new String[dishonest.size()];
		
		for (int i = 0; i < dishonest.size(); i++) {
			dishonestMembers[i] = dishonest.get(i);
		}
		return dishonestMembers;
		
	}
}
