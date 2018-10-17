import java.util.*;
public class DonorStats {
    public String[] calculate(String[] donations) {
    	HashMap<String, ArrayList<Integer>> donorInfo = new HashMap<>();
    	for (int i = 0; i < donations.length; i++) {
    		int colonIndex = donations[i].indexOf(":");
    		String name = donations[i].substring(0, colonIndex);
    		ArrayList<Integer> amounts = new ArrayList<>();
    		if (!donorInfo.containsKey(name)) {
    			donorInfo.put(name, amounts);
    		}
    		String [] stringAmounts = donations[i].substring(colonIndex+1, donations[i].length()).split(",");
    		int [] intAmounts = new int[stringAmounts.length];
    		for (int j = 0; j < intAmounts.length; j++) {
    			intAmounts[j] = Integer.parseInt(stringAmounts[j]);
    		}
    		for (int amount: intAmounts) {
    			amounts.add(amount);
    		}
    		donorInfo.put(name, amounts);
    	}
    	String [] donorStats = new String[donorInfo.size()];
    	int i = 0;
    	for (String key: donorInfo.keySet()) {
    		int sum = 0;
    		for (Integer number: donorInfo.get(key)) {
    			sum += number;
    		}
    		donorStats[i] = String.format("%s:%d:%d", key, donorInfo.get(key).size(), sum);
    	}
    	return donorStats;
    }

}
