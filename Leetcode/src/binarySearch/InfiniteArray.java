package binarySearch;

public class InfiniteArray {
	
	//Find element in an infinite sized array
	//Infinite array is one whose size is not known
	public int binarySearch(int[] arr, int target, int start, int end) {
		//int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target)
				return mid;
			else if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			}
		}
		return -1;
	}
	//2,3,4,5----4
	public int findElement(int[] arr, int target) {
		int start = 0, end = 1;
		while(target > arr[end] && end<arr.length-1) {
			start = end;
			if(end*2 <= arr.length-1) {
				end = end *2;
			}
			else end = arr.length-1;
		}
		return binarySearch(arr, target, start, end);
	}

}
