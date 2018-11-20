
public class ListLastFirst {
    public ListNode move(ListNode list) {
    	ListNode first = list;
    	ListNode secondLast = null;
    	ListNode last = null;
    	if (list == null) {
    		return null;
    	}
    	if (list.next == null) {
    		return list;
    	}
    	while (list.next.next != null) {
    		list = list.next;
    	}
    	secondLast = list;
    	last = list.next;
    	
    	first = new ListNode(last.info, first);
    	secondLast.next = null;
    	return first;
    }
}
