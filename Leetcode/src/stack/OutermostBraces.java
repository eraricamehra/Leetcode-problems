package stack;

import java.util.Stack;

public class OutermostBraces {
	
//	public String removeOuterParentheses(String s)  {
//		if(s== null) return "";
//		Stack<Character> stack = new Stack<>();
//		String result ="";
//		int i=0;
//		while(i <= s.length()-1 ) {
//			System.out.println(s.charAt(i));
//			if(s.charAt(i) == '(' && s.charAt(i + 1) != ')' ) {
//				stack.push(s.charAt(i));
//				i++;
//			}
//			
//			else if(s.charAt(i) == '(' && s.charAt(i + 1) == ')' ) {
//				result += s.charAt(i);
//				result += s.charAt(i+1);
//				i=i+2;
//			}
//			else if(s.charAt(i) == ')') {
//				if(!stack.isEmpty()) {
//					if(stack.peek() == '(')  {
//						stack.pop();
//						i++;
//					}
//				}
//			}
//			else {
//				i++;
//			}
//			
//		}
//		
//        return result;
//	}
	
	public String removeOuterParentheses(String s) {
		int i =0, count =0;
		StringBuilder result = new StringBuilder();
		while(i< s.length() -1) {
			if(s.charAt(i) == '(') count++;
			else if (s.charAt(i) == ')') count--;
			
			if((count == 0)  || (count ==1 && s.charAt(i) =='(')) {
				result.append(s.substring(i+1, s.length())) ;
				
				result.append(s.substring(i+1, s.length())) ;
			}
			i++;
		}
		return result.toString();
	}
	

}
