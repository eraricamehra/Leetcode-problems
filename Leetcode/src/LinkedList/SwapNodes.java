package LinkedList;

public class SwapNodes {
	
public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy = new ListNode(0);
        dummy.setNext(head);
        int size = 1;
        ListNode current = head;
        ListNode leftNode = null, leftPrev= null, temp= null, rightNode= null, rightPrev = null;
        
        if(left == right) return head;
        if(left == 1) {
            leftPrev = dummy;
            leftNode = current;
        }
        
        while(current != null) {
            if(size == left -1) {
                leftPrev = current;
                leftNode = current.getNext();
            }
             if(size == right -1) {
                rightPrev = current;
                rightNode = current.getNext();
                temp =  rightNode.getNext();
            }
            
            current = current.getNext();
            size ++;
        }
        
        //swap;
        leftPrev.setNext(rightNode);
        rightNode.setNext(leftNode.getNext());
        rightPrev.setNext(leftNode);
        leftNode.setNext(temp);
        
        return dummy.getNext();
    }

}
