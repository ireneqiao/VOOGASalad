
public class CounterAttack {
	public int[] analyze(String str, String[] words) {
		int [] count = new int[words.length];
        String[] separate = str.split(" ");
        for (int i = 0; i < words.length; i++) {
        	int counter = 0;
        	for (int j = 0; j < separate.length; j++) {
        		if (words[i].equals(separate[j])){
        			counter++;
        		}
        	}
        	count[i] = counter;
        }
        return count;
    }
}
