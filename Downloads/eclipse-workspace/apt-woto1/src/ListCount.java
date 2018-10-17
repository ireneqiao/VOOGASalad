
public class ListCount {
	public int count (ListNode list) {
		int t = 0;
		while (list!=null) {
			list = list.next;
			t++;
		}
		return t;
    }

}
