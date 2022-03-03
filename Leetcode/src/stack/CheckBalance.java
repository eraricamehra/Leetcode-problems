package stack;

import java.util.Stack;

public class CheckBalance {
	
	public boolean isValid(String str) {
		Stack<Character> stack = new Stack<>();
		
		if(str==null || str.length() ==0) return true;
		int i=0;
		while(i<str.length()) {
			if(str.charAt(i) ==')') {
				if(!stack.isEmpty() && stack.peek() == '(')
					stack.pop();
				else return false;
			}
			
			else if(str.charAt(i) == ']') {
				if(!stack.isEmpty() && stack.peek() == '[')
					stack.pop();
				else return false;
			}
			else if(str.charAt(i) == '}') {
				if(!stack.isEmpty() && stack.peek() == '{')
					stack.pop();
				else return false;
			}
			else {
				stack.push(str.charAt(i));
			}
            			
			i++;
		}
		
		if(!stack.isEmpty()) return false;
		
		return true;
		
	}

}
