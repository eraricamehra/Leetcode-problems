package LinkedList;

public class LinkedListCycle {
	
	   public boolean hasCycle(ListNode head) {
	        if(head == null || head.getNext() == null) return false;
	        ListNode fast = head;
	        ListNode slow = head;
	        while(fast != null && fast.getNext() != null) {
	            slow = slow.getNext();
	            fast = fast.getNext().getNext();
	            
	            if(slow.equals(fast)) {
	                return true;
	            }
	        }
	        return false;
	             
	        
	    }

}
