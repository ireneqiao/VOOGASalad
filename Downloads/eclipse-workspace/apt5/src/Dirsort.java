import java.util.*;
public class Dirsort {
    public String[] sort(String[] dirs) {
    	List<String> list = Arrays.asList(dirs);
    	Collections.sort(list, new DirComp());
    	String [] directories = new String[list.size()];
    	for (int k = 0; k < list.size(); k++) {
    		directories[k] = list.get(k);
    	}
    	return directories;
   }
   
   public class DirComp implements Comparator<String>{
	public DirComp() {}
	@Override
	public int compare(String o1, String o2) {
		String[] arr = o1.split("/");
		String[] brr = o2.split("/");
		if (arr.length > brr.length) {
			return 1;
		}
		else if (arr.length < brr.length) {
			return -1;
		}
		else if (arr.length == brr.length) {
			for (int k = 0; k < arr.length; k++) {
				int elementComp = arr[k].compareTo(brr[k]);
				if (elementComp != 0) {
					return elementComp;
				}
			}
		}
		return 0;
	}	
	   
   }
}
