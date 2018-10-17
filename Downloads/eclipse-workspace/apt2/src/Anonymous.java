
public class Anonymous {
	
	 public int howMany(String[] headlines, String[] messages) {
		 int canWrite = 0;
		 int [] headlinesCount = new int [26];
		 
		 for (int k = 0; k < headlines.length; k++) {
			 String useHeadline = headlines[k].toLowerCase();
	
			 for (int j = 0; j < useHeadline.length(); j++) {
				 char letter = useHeadline.charAt(j);
				 if (letter != 32) {
					 headlinesCount[letter - 97] += 1;

				 }
			 }
		 }
		 
		 for (int k = 0; k < messages.length; k++) {
			 int [] messagesCount = new int [26];
			 boolean can = true;
			 String useMessage = messages[k].toLowerCase();
			 
			 for (int j = 0; j < useMessage.length(); j++) {
				 char letter = useMessage.charAt(j);
					if (letter != 32) {
						messagesCount[letter - 97] += 1;
					}
			 }
			 for (int i = 0; i < headlinesCount.length; i++) {
				 if (messagesCount[i] >  headlinesCount[i]) {
					 can = false;
				 }
			 }
			if (can) {
				canWrite ++;
			}
		 }
		 return canWrite;
	 }      
}
