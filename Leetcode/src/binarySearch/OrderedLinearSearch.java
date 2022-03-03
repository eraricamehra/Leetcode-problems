package binarySearch;

public class OrderedLinearSearch {
	
	public int orderedLinearSearch(int A[], int data) {
		int i=0;
		while(i < A.length) {
			if(A[i] > data) return -1;
			else if(A[i] == data) return i;
			i++;
		}
		return -1;
	}
	
	

}
