import java.util.*;
public class PairDown {
    public int[] fold(int[] list) {
    	List<Integer> paired = new ArrayList<>();
        for (int i = 0; i < list.length; i+=2) {
        	if (!(i == list.length-1)) {
            	paired.add(list[i]+list[i+1]);

        	}
        	else {
        		paired.add(list[i]);
        	}
        }
        int[] pairDown = new int[paired.size()];
        for (int i = 0; i < paired.size(); i++) {
        	pairDown[i] = paired.get(i);
        }
        return pairDown;
    }

}
