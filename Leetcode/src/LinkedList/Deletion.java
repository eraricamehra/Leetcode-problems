package LinkedList;

public class Deletion {

	public void deleteFromBeg(ListNode head) {
		if (head == null)
			return;
		ListNode temp = head;
		head = temp.getNext();
		temp.setNext(null);
	}

	public void deleteFromEnd(ListNode head) {
		if (head == null)
			return;
		ListNode current = head;
		ListNode prev = null;
		while (current.getNext() != null) {
			prev = current;
			current = current.getNext();
		}

		prev.setNext(null);
		current = null;
	}

	public void delete(ListNode head, int pos) {
		if (head == null)
			return;
		ListNode current = head;
		ListNode prev = null;
		int len =1;
		while (pos != len && current!= null) {
			prev = current;
			len++;
			current = current.getNext();
		}
		if (len == pos) {
			prev.setNext(current.getNext());
			current.setNext(null);
		}
	}
	
	public void deleteWithoutHead(ListNode node) {
		if (node != null) {
		node.setData(node.getNext().getData());
		node.setNext(node.getNext().getNext());
		}
	}

}
