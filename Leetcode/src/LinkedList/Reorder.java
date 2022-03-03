package LinkedList;

public class Reorder {
	
	 public void reorderList(ListNode head) {
	        
	        if(head == null) return;
	        if(head.getNext() == null) return ;
	        //divide list into 2
	        ListNode dummy = new ListNode(0);
	        dummy.setNext(head);
	        ListNode slow = head;
	        ListNode fast = head;
	        
	        while(fast!=null && fast.getNext() != null) {
	            slow  = slow.getNext();
	            fast = fast.getNext().getNext();
	        }
	        
	        ListNode prev = slow;
	        ListNode current = slow.getNext();
	        prev.setNext(null);
	        
	        //Reverse second half of the list
	        
	        while(current != null) {
	            ListNode nextNode = current.getNext();
	            current.setNext(prev);
	            prev = current;
	            current = nextNode;
	        }
	        
	        // Merge Lists
	        
	        current = head;
	        
	        InsertionImpl impl = new InsertionImpl();
	        System.out.println("Two List");
	        impl.traverse(current);
	        System.out.println("  ");
	        impl.traverse(prev);
	        
	        while(prev != null && prev.getNext() != null) {
	            ListNode currentNext = current.getNext();
	            ListNode prevNext = prev.getNext();
	            current.setNext(prev); 
	            prev.setNext(currentNext);
	            current = currentNext;
	            prev = prevNext;
	        }
	        
	       
	        System.out.println("  ");
	        impl.traverse(head);
	        
	    }

}
