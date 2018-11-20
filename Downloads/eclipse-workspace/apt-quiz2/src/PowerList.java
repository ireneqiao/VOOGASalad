
public class PowerList {
    public ListNode create(int n) {
    	if (n < 2) {
    		return null;
    	}
    	else if (n != 0) {
        	int counter = 2;
        	ListNode first = new ListNode(1, null);
        	ListNode list = first;
        	while (counter < n) {
        		list.next = new ListNode(counter, null);
        		list = list.next;
        		counter = counter * 2;
        	}
        	return first;
        }
    	return null;
    }
}
