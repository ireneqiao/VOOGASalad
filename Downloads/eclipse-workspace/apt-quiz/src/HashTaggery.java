
public class HashTaggery {
	 public String maxTag(String[] tags, String[] messages) {
         int taggedCount = 0;
         for (String m: messages) {
        	 int tagged = 0;
        	 for (String t: tags) {
        		 if (m.contains(" " + t + " ") || m.endsWith(t) || m.startsWith(t)){
        			 tagged++;
        		 }
        	 }
        	 if (tagged > 0) {
        		 taggedCount++;
        	 }
         }
         if((taggedCount / (double)messages.length) >= 0.75) {
        	 return "tagged";
         }
         return "missed";
     }

}
