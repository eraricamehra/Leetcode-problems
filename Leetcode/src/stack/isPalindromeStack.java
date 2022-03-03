package stack;

import java.util.Stack;

public class isPalindromeStack {
	
	public boolean isPalindrome(String str) {
		
		Stack<Character> stack = new Stack<>();
		int i=0;
		//System.out.println("length " + str.length());
		while(str.charAt(i)!='X') {
			if(i==str.length()-1) return false;
			stack.push(str.charAt(i));
			i++;
		}
		i++;
		while(i<str.length()) {
			if(stack.isEmpty()) return false;
			if(str.charAt(i) != stack.pop()) return false;
			else i++;
		}
		return true;
	}

}
