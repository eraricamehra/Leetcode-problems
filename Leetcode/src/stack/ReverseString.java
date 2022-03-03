package stack;

import java.util.Stack;

public class ReverseString {

	
	public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        if(s.length > 0) {
        for(int i=0; i<s.length; i++) {
            stack.push(s[i]);
        }
        int i=0;
        while(!stack.isEmpty()) {
            s[i] = stack.pop();
            i++;
        }
        }
    }
}
