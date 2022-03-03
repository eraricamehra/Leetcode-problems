package LinkedList;

public class SwapPairs {
	
	 public ListNode swapPairs(ListNode head) {
	        if(head == null) return null;
	        if(head.getNext() == null) return head;
	        
	        ListNode first = head;
	        ListNode second;
	        ListNode dummy = new ListNode(0);
	        ListNode prev = dummy;
	        

	        while(first != null && first.getNext() != null) {
	            second = first.getNext();
	            ListNode connection = second.getNext();
	            prev.setNext(second);
	            second.setNext(first);
	            first.setNext(connection);
	            prev = first;
	            first = first.getNext();
	            
	        }        
	           return dummy.getNext();
	 
	    }

}
