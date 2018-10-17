import java.util.*;

public class SimpleWordGame {
    public int points(String[] player, String [] dictionary) {
    	int score = 0;
    	Set<String> dict = new HashSet<>(Arrays.asList(dictionary));
    	List<String> playerWords = Arrays.asList(player);
    	dict.retainAll(playerWords);
    	for (String word: dict) {
    		score += (int) Math.pow(word.length(), 2);
    	}
    	return score;
    }
}
