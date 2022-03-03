package LinkedList;


public class SortList {
	
	
	public ListNode mergeSortList(ListNode head) {
		
		ListNode slow = head;
		ListNode fast = head;
		ListNode temp = head;
		if(head == null || head.getNext() == null) {
			return head;
		}
		while(fast!= null && fast.getNext() != null) {
			fast = fast.getNext().getNext();
			temp = slow;
			slow = slow.getNext();
		}
		temp.setNext(null);
		
		ListNode left = mergeSortList(head);
		ListNode right = mergeSortList(slow);
		
		ListNode result = merge(left, right);
		
		return result;
	}

	public ListNode merge(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode dummy = new ListNode(0);
		dummy.setNext(null);
		ListNode current = dummy;

		while (l1 != null && l2 != null) {
			if (l1.getData() <= l2.getData()) {
				current.setNext(l1);
				current = current.getNext();
				l1 = l1.getNext();
			} else {
				current.setNext(l2);
				current = current.getNext();
				l2 = l2.getNext();
			}
		}
		if (l1 != null) {
			current.setNext(l1);
		}
		if (l2 != null) {
			current.setNext(l2);
		}
		return dummy.getNext();
	}

}
