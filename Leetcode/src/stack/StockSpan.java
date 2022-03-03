package stack;

import java.util.Stack;

import org.apache.commons.lang3.tuple.Pair;

public class StockSpan {

	public void StockSpanner() {
	        
	    }

	public int[] next(int[] price) {
		Stack<Pair<Integer, Integer>> stack = new Stack<Pair<Integer, Integer>>();
		int[] list = new int[price.length];
		int k = 0;

		for (int i = 0; i < price.length; i++) {
			if (stack.size() == 0)
				list[k] = 1;
			else if (stack.size() > 0) {
				if (stack.peek().getLeft() <= price[i]) {

					while (stack.size() > 0 && stack.peek().getLeft() <= price[i]) {
						stack.pop();
					}
					if (stack.size() == 0)
						list[k] = 1;
					else if (stack.peek().getLeft() > price[i])
						list[k] = i - stack.peek().getRight();

				} else if (stack.peek().getLeft() > price[i]) {
					list[k] = 1;
				}
			}

			stack.push(Pair.of(price[i], i));
			k++;

		}
		return list;
	}

}
