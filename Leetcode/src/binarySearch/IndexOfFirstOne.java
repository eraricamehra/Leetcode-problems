package binarySearch;

//Find index of first one in an infinite binary sorted array
public class IndexOfFirstOne {

	public int getFirstOne(int[] arr) {
		if(arr.length ==0) return -1;		
		if(arr.length ==1 && arr[0] == 1) return 0;

		int start = 0, end =1;
		while(1 > arr[end]) {
			start = end;
			if(2*end <= arr.length-1) end = end *2;
			else end = arr.length-1;
		}
		return getFirstOccurence(arr, start, start, end);
	}
	
	public int getFirstOccurence(int[] arr, int target, int start, int end) {
		
		int firstOccurence = -1;
		target = 1;
		
		while (start<=end) {
			int mid = start + (end -start)/2;
			
			if(arr[mid] == target) {
				firstOccurence = mid;
				end = mid-1;
			} else if (target > arr[mid]) start = mid +1;
			else end = mid-1;
		}
		return firstOccurence;
	}

}
