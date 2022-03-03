package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestGreaterRight {

	public int[] nearestGreaterRight(int[] arr) {

		Stack<Integer> stack = new Stack<>();
		List<Integer> result = new ArrayList<>();
		int[] list = new int[arr.length];
		int k=0;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (stack.size() == 0) {
				result.add(-1);
				list[k] =-1;
			}

			else if (stack.size() > 0 && stack.peek() > arr[i]) {
				result.add(stack.peek());
				list[k] =stack.peek();
			}

			else if (stack.size() > 0 && stack.peek() <= arr[i]) {
				// pop till stack is empty or top is greater than element

				while (stack.size() > 0 && stack.peek() <= arr[i]) {
					stack.pop();
				}

				if (stack.size() == 0) {
					list[k] =-1;
					result.add(-1);
				}
					
				else if (stack.peek() > arr[i]) {
					result.add(stack.peek());
					list[k] =stack.peek();
				}
			}

			stack.push(arr[i]);
			k++;
			

		}
		System.out.println(result);
		
		list = reverse(list);
		for(int l =0; l < list.length ; l++)
			System.out.println(list[l]);
		return list;
	}
	
	public int[] reverse(int[] arr) {
		int i=0; 
		int j=arr.length-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		} 
		return arr;
			
	}

}
