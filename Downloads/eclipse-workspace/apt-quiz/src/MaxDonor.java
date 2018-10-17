import java.util.*;
public class MaxDonor {
    public String generous(String[] orgs, int[] amount) {
        Map<String, Integer> donations = new HashMap<>();
        for (int i=0; i < orgs.length; i++) {
        	if (!donations.containsKey(orgs[i])){
        		donations.put(orgs[i], 0);
        	}
        	donations.put(orgs[i], donations.get(orgs[i])+ amount[i]);
        }
        int maxDonations = 0;
        String maxOrg = null;
        for (Map.Entry<String, Integer> org: donations.entrySet()) {
        	if (org.getValue() > maxDonations) {
        		maxDonations = org.getValue();
        		maxOrg = org.getKey();
        		
        	}
        }
        return maxOrg + ":$" + maxDonations;
    }
}
