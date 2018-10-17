import java.util.*;
public class Starter {
	
	public int begins(String[] words, String first) {
		int count = 0;
        Set<String> unique = new HashSet<>(Arrays.asList(words));
        List<String> firstLetter = new ArrayList<>();
        for (String s: unique) {
        	firstLetter.add(s.substring(0,1));
        }
        for (String f: firstLetter) {
        	if (f.equals(first)) {
        		count++;
        	}
        }
        return count;
    }
}
