package stack;

import java.util.Stack;

public class Infix {

	public int evaluateExpression(String expression) throws Exception {
		Stack<Integer> numbers = new Stack<>();

		Stack<Character> operator = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {

			Character ch = expression.charAt(i);

			// if char is number
			if (Character.isDigit(ch))
				numbers.push(ch - '0');

			// if char is (
			else if (ch == '(')
				operator.push(ch);

			// if char is )
			else if (ch == ')') {
				while (operator.peek() != '(') {
					int result = performOp(numbers, operator);

					numbers.push(result);
				}
				operator.pop();
			}
			// if ch is operator
			else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

				while (!operator.isEmpty() && precedence(ch) <= precedence(operator.peek())) {
					int result = performOp(numbers, operator);
					numbers.push(result);
				}
				operator.push(ch);
			}
		}
		while (!operator.isEmpty()) {
			int	result = performOp(numbers, operator);
			
			numbers.push(result);
		}

		return numbers.pop();

	}

	public int performOp(Stack<Integer> numbers, Stack<Character> operator) throws Exception {
		int op1 = numbers.pop();
		int op2 = numbers.pop();
		Character ch = operator.pop();

		switch (ch) {
		case '+':
			return (op2 + op1);
		case '-':
			return (op2 - op1);
		case '*':
			return (op2 * op1);
		case '/':
			if (op1 == 0)
				throw new Exception("denominator is zero");
			return (op2 / op1);
		}
		return 0;
	}

	public int precedence(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

}
