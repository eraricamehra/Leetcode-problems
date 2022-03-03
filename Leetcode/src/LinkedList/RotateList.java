package LinkedList;

public class RotateList {

	//TODO improve this
	public ListNode rotateRight(ListNode head, int k) {

		if (head == null)
			return null;
		if (head.getNext() == null || k <= 0) return head;
		ListNode fast = head;
		ListNode temp;
		int length = 0;

		// find length of list
		while (fast != null && fast.getNext() != null) {
			fast = fast.getNext();
			length++;
		}
		length++;
		fast.setNext(head);
		int rot;
		if (k < length) {
			rot = length - k;

		} else {
			rot = length - (k % length);
		}
		
		while(rot>0) {
			fast = fast.getNext();
			rot --;
		}
		
		temp = fast;
	    ListNode connection = fast.getNext();
		temp.setNext(null);
	    return connection;

	}

}
