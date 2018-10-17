import java.util.*;
public class StringCuts {
    public String[] filter(String[] list, int minLength) {
    	List<String> listWords = Arrays.asList(list);
    	List<String> duplicate = new ArrayList<>();
    	for (String w: listWords) {
    		if (!duplicate.contains(w)) {
    			duplicate.add(w);
    		}
    	}
    	List<String> filteredWords = new ArrayList<>();
    	int i = 0;
    	for (String w: duplicate) {
    		if (w.length() >= minLength) {
    			filteredWords.add(w);
    		}
    	}
    	String[] filtered = new String[filteredWords.size()];
    	filteredWords.toArray(filtered);
        return filtered;
    }
}
