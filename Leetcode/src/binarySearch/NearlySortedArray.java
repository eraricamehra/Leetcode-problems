package binarySearch;

//Searching in a nearly sorted array
public class NearlySortedArray {
	
	public int getElement(int[] arr, int target) {
		int start = 0, end  = arr.length -1;
		
		while(start <= end && start>=0 && end<=arr.length-1) {
			int mid = start + (end - start)/2;
			int next = (mid != arr.length -1) ?mid +1: mid ;
			int prev = (mid != 0)? mid - 1: mid;
			
			if(arr[mid] == target)  {
				return mid;
			}
			if (arr[next] == target)
				return next;
			if( arr[prev] == target) 
				return prev;
			
			if(target < arr[mid]) end = mid -2;
			else start = mid+2;
		}
		return -1;
		
		
	}

}
