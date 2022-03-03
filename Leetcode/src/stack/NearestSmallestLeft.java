package stack;

import java.util.Stack;

public class NearestSmallestLeft {
	
	public int[] nearestSmalestLeft(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		int[] list = new int[arr.length];
		int k=0;
		
		for(int i=0; i< arr.length; i++) {
			
			if(stack.size() ==0) list[k] = -1;
			
			else if(stack.size() >0 && stack.peek() < arr[i])
				list[k] = stack.peek();
			
			else if(stack.size() >0 && stack.peek() >= arr[i]) {
				while(stack.size() >0 && stack.peek() >= arr[i]) {
					stack.pop();
				}
				if(stack.size() ==0) list[k] =-1;
				else if(stack.peek() < arr[i]) list[k] = stack.peek();
			}
			
			stack.push(arr[i]);
			k++;
			
		}
		for(int l =0; l < list.length ; l++)
			System.out.print(list[l] + ", ");
		return list;
	}

}
