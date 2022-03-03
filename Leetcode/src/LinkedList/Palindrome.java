package LinkedList;

public class Palindrome {
	 public boolean isPalindrome(ListNode head) {
	        ListNode slow = head; 
	        ListNode fast = head;
	        ListNode prev;
	        
	        while(fast != null && fast.getNext() != null) {
	            fast = fast.getNext().getNext();
	            slow = slow.getNext();
	        }
	        prev = slow;
	        slow = slow.getNext();
	        prev.setNext(null);
	        

	        while(slow != null) {
				ListNode nextNode = slow.getNext();
				slow.setNext(prev);
				prev = slow;
	            slow = nextNode;
	        }
	        
	        fast = head;
	        slow = prev;
	        boolean flag = false;

	        while(slow != null) {
	            if(slow.getData() != fast.getData()) {
	                return false;
	            } else {
	            	slow = slow.getNext();
	                fast = fast.getNext();
	                flag = true;
	            }
	        }
	        return flag;
	    }

}
