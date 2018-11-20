import java.util.*;
public class SortByFreqs {
    public String[] sort(String[] data) {
        Map<String, Integer> values = new HashMap<>();
        List<StringFreq> comps = new ArrayList<>();
        for (String s: data) {
        	if (!values.containsKey(s)) {
        		values.put(s, 0);
        	}
        	values.put(s, values.get(s) + 1);
        }
        for (String name: values.keySet()) {
        	comps.add(new StringFreq(name, values.get(name)));
        }
        Collections.sort(comps);
        String[] ret = new String[comps.size()];
        for (int i = 0; i < comps.size(); i++) {
        	ret[i] = comps.get(i).toString();
        }
        return ret;
        
    }
    
    public class StringFreq implements Comparable{
    	private String name;
    	private int freq;
    	public StringFreq(String s, int f) {
    		name = s;
    		freq = f;
    	}
    	
    	@Override
    	public String toString() {
    		return name;
    	}
		@Override
		public int compareTo(Object o) {
		StringFreq other = (StringFreq) o;
		int freqComp = freq - other.freq;
		if (freqComp != 0) {
			return freqComp * -1;
		}
		else {
			int nameComp = name.compareTo(other.name);
			if (nameComp != 0) {
				return nameComp;
			}
			return 0;
		}
		}
    	
    	
    }
}
