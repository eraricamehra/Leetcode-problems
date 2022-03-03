package binarySearch;


//How many times is a  sorted array rotated?
public class RotationCount {

	public int rotations(int [] arr) {
		int low=0, high = arr.length-1;
		int len = arr.length;
		
		while(low< high) 
		{
			int mid = low + (high - low)/2;
			int next = (mid +1) %len;
			int prev = (mid +len -1) %len;

			
			if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
				return mid;
			} else if (arr[mid] >= arr[high]) {
				low = mid+1;
			} else {
				high = mid -1;
			}

		}
		if(low ==0 && high ==0) return len;
		return low;
		
	}
}
