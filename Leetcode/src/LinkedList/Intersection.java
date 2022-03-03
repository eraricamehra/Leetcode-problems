package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

	
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        
	        if(headA == null || headB == null) return null;
	        
	        Set<ListNode> visited = new HashSet<ListNode>();
	        
	        while(headA != null) {
	            visited.add(headA);
	            headA= headA.getNext();
	        }
	        
	        while(visited.add(headB) != false) {
	            headB = headB.getNext();
	        }
	        
	        headB= headB.getNext();
	        return headB;
	        
	    }
}
