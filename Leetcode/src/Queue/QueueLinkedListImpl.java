package Queue;

import LinkedList.ListNode;

public class QueueLinkedListImpl {
	private int length;
	private ListNode front, rear;

	// empty queue
	public QueueLinkedListImpl() {
		length = 0;
		front = null;
		rear = null;
	}

	// enqueue
	public void enqueue(int data) {
		ListNode node = new ListNode(data);
		if (isEmpty())
			front = node;
		else
			rear.setNext(node);
		rear = node;
		length++;

	}
	// dequeue

	public int denqueue() throws Exception {
		if (isEmpty()) {
			rear = null;
			throw new Exception("Underflow");
		}
		int result = front.getData();
		front = front.getNext();
		length--;
		return result;
	}

	public int first() throws Exception {
		if (isEmpty())
			throw new Exception("Underflow");
		return front.getData();
	}

	public int size() {
		return length;
	}

	public boolean isEmpty() {
		return (length == 0) ? true : false;
	}

	public String toString() {
		String res = "";
		ListNode curr = front;
		while (curr != null) {
			res = res + curr.getData() + ", ";
			curr = curr.getNext();

		}
		return res;
	}
}
