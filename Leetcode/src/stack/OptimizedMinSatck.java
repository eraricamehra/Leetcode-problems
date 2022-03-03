package stack;

import java.util.Stack;

public class OptimizedMinSatck extends Stack {

	Stack<Integer> elementStack = new Stack<>();
	Stack<Integer> minStack = new Stack<>();

	public void pushElement(int data) {
		elementStack.push(data);
		if (minStack.isEmpty() && minStack.peek() > data)
			minStack.push(data);
	}

	public Integer popElement() {
		if (elementStack.isEmpty())
			return null;
		int element = elementStack.pop();
		if (!minStack.isEmpty() && minStack.peek().equals(element))
			minStack.pop();
		return element;
	}

	public Integer getMinimum() {
		return (!minStack.isEmpty()) ? minStack.pop() : null;
	}

	public int top() {
		return elementStack.peek();
	}

	public int minTop() {
		return minStack.pop();
	}

	public boolean isEmpty() {
		return elementStack.isEmpty();
	}

	// space complexity - O(n)
	// Time complexity - O(1)



}
