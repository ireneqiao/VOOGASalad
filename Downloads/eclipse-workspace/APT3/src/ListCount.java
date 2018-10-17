
public class ListCount {
    public int count (ListNode list) {
    	int counter;
    	if (list != null) {
    		counter = 1;
	    while (list.next != null) {
	    	counter++;
	    	list = list.next;
	    }
	}
	    
	    else {
	    	counter = 0;
	    }
    	
    return counter;
    }
}
