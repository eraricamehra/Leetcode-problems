package LinkedList;

public class InsertionImpl {
	
	public void insertion(int data, int position, ListNode head) {
		
		//create a new node
		ListNode newNode = new ListNode(data);
		int length = 0;
		//insert at beginning
		if (position == 1) {
			newNode.setNext(head);
			head = newNode;
		}
		ListNode current = head;
		if(position >1) {
			while(current.getNext() != null && length != position) {
				length++;
				current = current.getNext();
			}
			newNode.setNext(current.getNext());
			current.setNext(newNode);
		}
		
	}
	
	
	public void insertAtBeg(ListNode head, ListNode newNode) {
		if(head == null) {
			newNode = head;
			return;
		}
		newNode.setNext(head);
		head = newNode;
		System.out.println("inserted at beg");
		return;
		
	}
	
	public void insertAtEnd(ListNode head, ListNode newNode) {
		if(head == null) {
			newNode = head;
			return;
		}
		ListNode current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(newNode);
		System.out.println("inserted At End");
		return;
	}
	
	public int traverse(ListNode head) {
		int length =1;
		if(head == null) {
			return 0;
		}
		ListNode current = head;
		System.out.print(current.getData() + " -> ");

		while(current.getNext() != null) {
			length++;
			current = current.getNext();
			System.out.print(current.getData() + " -> ");

		}
		return length;
			
	}

}
