package LinkedList;

public class MergeLists {
    
	//Does not satisfy all cases
	public ListNode mergeTwoListsInPlace(ListNode l1, ListNode l2) {
		
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode head = l1.getData() <= l2.getData() ? l1: l2;
		while (l1 != null && l2 != null) {
			if (l1.getData() <= l2.getData()) {
				if (l1.getNext() == null) {
					l1.setNext(l2);
					break;
				} else if (l1.getNext().getData() > l2.getData()) {
					ListNode temp = l1.getNext();
					ListNode temp2 = l2.getNext();

					l1.setNext(l2);
					l2.setNext(temp);

					l2 = temp2;
					l1 = l1.getNext();

				} else {
					l1 = l1.getNext();
				}
			} else {
				ListNode temp = l1;
				ListNode temp2 = l2.getNext();

				l2.setNext(temp);

				l2 = temp2;

			}
		}  

		return head;
	}
	
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		
		ListNode dummy = new ListNode(0);
		dummy.setNext(null);
		ListNode head = (l1.getData() <= l2.getData()) ? l1 : l2;
		
		while (l1 != null && l2!= null) {
			if(l1.getData() <= l2.getData()) {
				dummy.setNext(l1);
				l1=l1.getNext();
				dummy = dummy.getNext();
			}
			
			else {
				dummy.setNext(l2);
				l2=l2.getNext();
				dummy = dummy.getNext();
			}
		}
		
		if(l1!= null) {
			dummy.setNext(l1);
		}
		
		if(l2!= null) {
			dummy.setNext(l2);
		}
		return head.getNext();
	}

}
