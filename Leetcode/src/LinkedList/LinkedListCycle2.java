package LinkedList;

public class LinkedListCycle2 {

	public ListNode detectCycle(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if (fast.equals(slow)) {
                slow = head;
                
                while(!slow.equals(fast)) {
                	slow = slow.getNext();
                	fast = fast.getNext();
                }
                return slow;
			}
		}
		return null;
	}
}
