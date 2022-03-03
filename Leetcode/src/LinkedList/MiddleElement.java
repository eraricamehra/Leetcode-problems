package LinkedList;

public class MiddleElement {

	public ListNode middleNode(ListNode head) {

		
		ListNode slow = head;
		ListNode fast = head;
		if(head == null) return null;
		while (fast != null && fast.getNext() != null) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
		}

		return slow;

	}

}
