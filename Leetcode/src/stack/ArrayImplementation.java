package stack;

public class ArrayImplementation {
	
	static int top = -1;
	static int capacity = 10;
	static int arr[] = new int[capacity];
	
	
 	
	public void pushElement(int x) throws Exception {
		top++;
		if(top == capacity) {
			System.out.println("Stack Overflow");
			throw new Exception("Stack Overflow");
		}
		arr[top] = x;
	}
	
	public void popElement() throws Exception {
		if(top == -1) {
			System.out.println("Stack Underflow");
			throw new Exception("Stack Underflow");
		}
		int element = arr[top];
		top--;
		//return element;
	}
	
	public boolean isEmpty() {
		if(top< 0) return true;
		return false;
		
	}
	public int topElement() throws Exception {
		if(top == -1) {
			System.out.println("Stack Underflow");
			throw new Exception("Stack Underflow");
		}
		return arr[top];
	}
	
	public String toString() {
		String s ="";
		if(top<0) return null;
		else {
			for(int i =0; i <arr.length; i++) {
				s = s + " " + arr[i];
			}
		}
		return s;
	}


}
