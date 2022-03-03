package LinkedList;

public class RemoveDuplicates {

	// Question 1 : Given the head of a sorted linked list, delete all duplicates
	// such that each element appears only once. Return the linked list sorted as
	// well.
	public ListNode deleteDuplicates1(ListNode head) {

		if (head == null)
			return null;
		if (head.getNext() == null)
			return head;
		ListNode slow = head;
		ListNode fast = head.getNext();

		while (slow != null && fast != null) {
			if (slow.getData() == fast.getData()) {
				slow.setNext(fast.getNext());
				fast = fast.getNext();
			} else {
				slow = slow.getNext();
				fast = fast.getNext();
			}
		}
		return head;

	}

	// Question 2 : Given the head of a sorted linked list, delete all nodes that
	// have duplicate numbers, leaving only distinct numbers from the original list.
	// Return the linked list sorted as well.
	//Review this
	//can be done using recursion also
	public ListNode deleteDuplicates(ListNode head) {

		ListNode dummy = new ListNode(0);
		ListNode prev = dummy;

		while (head != null) {
			if (head.getNext() != null && head.getData() == head.getNext().getData()) {
				while (head.getNext() != null && head.getData() == head.getNext().getData()) {
					head = head.getNext();
				}
				prev.setNext(head.getNext());
			}
			else {
				prev = prev.getNext();
			}
			
			head = head.getNext();

		}
		return dummy.getNext();

	}
}
