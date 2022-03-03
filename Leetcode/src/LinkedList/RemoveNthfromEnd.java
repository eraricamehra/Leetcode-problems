package LinkedList;

public class RemoveNthfromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode dummy = new ListNode(0);
		dummy.setNext(head);
		ListNode fast = dummy;
		ListNode slow = dummy;
        ListNode temp = null;
			// fast should reach n+1 position
			for (int i = 1; i < n + 1; i++) {
				fast = fast.getNext();
			}
			while (fast != null && fast.getNext()!= null) {
				fast = fast.getNext();
				slow = slow.getNext();
			}
			temp = slow;
			slow = slow.getNext();
			InsertionImpl impl = new InsertionImpl();
	        System.out.println("Two List");
	        impl.traverse(dummy.getNext());
	        System.out.println("  ");
	        impl.traverse(slow);
			if(slow != null)temp.setNext(slow.getNext());
			else temp.setNext(null);
		
		return dummy.getNext();

	}
}
