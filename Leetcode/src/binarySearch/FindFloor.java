package binarySearch;

public class FindFloor {
	
	public int findFloor(int[] arr, int target) {
		int start = 0, end  = arr.length -1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			//int next = (mid != arr.length -1) ?mid +1: mid ;
			int prev = (mid != 0)? mid - 1: mid;
			
			if(arr[mid] == target) return mid;
			else if ( target > arr[prev] && target < arr[mid]) 
				return prev;
//			else if ( target < arr[next] && target > arr[mid]) 
//				return next;
			else if (target < arr[mid]) {
				end = mid-1;
			}
			else start = mid +1;
		}
		return -1;

	}

}
