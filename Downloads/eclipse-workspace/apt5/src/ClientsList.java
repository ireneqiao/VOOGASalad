import java.util.*;
public class ClientsList {
	private List<Person> clients = new ArrayList<>();
    public String[] dataCleanup(String[] names) {
    	for (String person: names) {
    		if (person.indexOf(",") < 0) {
    			clients.add(new Person(person));
    		}
    		else {
    			String name = person.split(", ")[1] + " " + person.split(", ")[0];
    			clients.add(new Person(name));
    		}
    	}
    	Collections.sort(clients);
    	String [] sorted = new String[clients.size()];
    	for (int k = 0; k < clients.size(); k++) {
    		sorted[k] = clients.get(k).toString();
    	}
    	return sorted;
   }
    
    public class Person implements Comparable{
    	String first;
    	String last;
    	public Person(String name) {
    		first = name.split(" ")[0];
    		last = name.split(" ")[1];
    	}
    	public String getFirst() {
    		return first;
    	}
    	public String getLast() {
    		return last;
    	}
    	
    	@Override
    	public String toString() {
    		return first + " " + last;
    	}
		@Override
		public int compareTo(Object o) {
			Person client = (Person)o;
			int compareLast = last.compareTo(client.last);
			if (compareLast != 0) {
				return compareLast;
			}
			else {
				int compareFirst = first.compareTo(client.first);
				if (compareFirst != 0) {
					return compareFirst;
				}
				else {
					return 0;
				}
			}
		}
    }
}
