package stack;

import LinkedList.ListNode;

public class LinkedStack<T> {

	int length = 0;
	ListNode top;

	public void LinkedStack() {
		length = 0;
		top = null;
	}

	public void push(int data) {
		ListNode newNode = new ListNode(data);
		newNode.setNext(top);
		top = newNode;
		length++;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception(" Stack is Empty");
		}
		int result = top.getData();
		top = top.getNext();
		length--;
		return result;
	}

	public boolean isEmpty() {
		return (top == null) ? true : false;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception(" Stack is Empty");
		}
		return top.getData();
	}

	public int size() {
		return length;
	}
	
	public String toString() {
		String s="";
		if (isEmpty()) {
			return null;
		}
		
		ListNode current = top;
		while(current != null) {
			s = s + " " + current.getData();
			current = current.getNext();
		}
		return s;
	}

}
