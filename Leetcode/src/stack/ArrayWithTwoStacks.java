package stack;

public class ArrayWithTwoStacks {
	
	private  int[] dataArray;
	private  int top1;
	private  int top2;
	private  int size;
	public ArrayWithTwoStacks(int size) throws Exception {
		if(size < 2) throw new Exception("Size < 2");
		dataArray = new int[size];
		this.size  = size;
		top1 = 0;
		top2 = dataArray.length -1;
	}
	
	public void push(int stackId, int data) throws Exception {
		if(top1 == top2 +1 ) throw new Exception("Array is full");
		if(stackId == 1) {
			dataArray[top1] = data;
			top1++;
		} else if(stackId == 2) {
			dataArray[top2] = data;
			top2--;
		}
		else return;
	}
	
	public Integer pop(int stackId) throws Exception {
		Integer element;
		if(stackId == 1) {
			if(top1 ==-1) throw new Exception("Stack is empty");
			element = dataArray[top1];
			top1--;
		} else if(stackId == 2) {
			if(top2 ==size) throw new Exception("Stack is empty");
			element = dataArray[top2];
			top2++;
		} else element = null;
		
		return element;
	}
	
	public Integer top(int stackId) throws Exception {
		int element;
		
		if(stackId == 1 ) {
			if(top1 ==-1) throw new Exception("Stack is empty");
			return dataArray[top1];
		} else if(stackId == 2 ) {
			if(top2 ==size) throw new Exception("Stack is empty");
			return dataArray[top2];
		} else return null;
		
	}
	
	public boolean isEmpty(int stackId) {
		if(stackId == 1 ) {
			if(top1<size) return true;
		} else if(stackId == 2 ) {
			if(top2 >-1) return true;
		} 
		return false;
	}
	
	public String toString() {
		for(int j =0; j < dataArray.length; j++) {
			System.out.print(dataArray[j] + ", ");
		}
		return null;
	}
	
	//Time complexity - O(1)
	//Space complexity - O(1)


}
