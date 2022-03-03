package stack;

import java.util.Stack;

public class Postfix {
	
	//TODO evaluate for multiple digit numbers and unary operators
	public int evaluateExpression(String expression) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i< expression.length(); i++) {
			Character token = expression.charAt(i);
			if(Character.isDigit(token)) stack.push(token - '0');
			else {
				int op1 = stack.pop();
				int op2 = stack.pop();
				switch(token) {
				case '+':
					stack.push(op2 + op1);
					break;
				case '-':
					stack.push(op2 - op1);
					break;	
				case '*':
					stack.push(op2 * op1);
					break;
				case '/':
					stack.push(op2 / op1);
					break;
				}
			}
			
		}
		
		return stack.pop();
	}

}
