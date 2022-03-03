package LinkedList;

public class Reverse {
	
	public ListNode reverse (ListNode head) {
		
		ListNode current = head;
		ListNode prev=null;
		
		while(current != null) {
			ListNode next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

}
