package binarySearch;

//Find element in a sorted rotated array
//[11, 12, 13, 14, 6, 7,8,9]
public class ElementInSortedRotatedArray {

//	public int binarySearch(int[] arr, int target, int start, int end) {
//		// int start = 0, end = arr.length - 1;
//
//		while (start <= end) {
//			int mid = start + (end - start) / 2;
//
//			if (arr[mid] == target)
//				return mid;
//			else if (target > arr[mid]) {
//				start = mid + 1;
//			} else if (target < arr[mid]) {
//				end = mid - 1;
//			}
//		34}
//		return -1;
//	}
//
//	public int getElement(int[] arr, int target) {
//		int mid = getRotationCount(arr);
//		System.out.println("The mid is " + mid);
//		int result;
//		if (target == arr[mid])
//			return mid;
//		else if (target > arr[mid] && target <= arr[arr.length - 1]) {
//			result = binarySearch(arr, target, mid, arr.length - 1);
//
//		} else {
//			result = binarySearch(arr, target, 0, mid - 1);
//		}
//		return result;
//	}
//
//	public int getRotationCount(int[] arr) {
//		int start = 0, end = arr.length - 1;
//		int len = arr.length;
//		while (start <= end) {
//			int mid = start + (end - start) / 2;
//
//			int next = (mid + 1) % len;
//			int prev = (mid + len - 1) % len;
//			if (arr[mid] <= arr[prev] && arr[mid] <= arr[next])
//				return mid;
//			else if (arr[end] <= arr[mid])
//				start = mid + 1;
//			else
//				end = mid - 1;
//		}
//		return -1;
//
//	}

	 public int search(int[] arr, int target) {	
		if(arr == null || arr.length < 2) return -1;
		int start = 0;
		int end = arr.length -1 ;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[end]) start = mid + 1;
			else end = mid;
			
		}
		
		int pivot = start;
		start = 0;
		end = arr.length -1 ;
		if(target >= arr[pivot] && target <= arr[end]) {
			start = pivot;
		} else  {
			end = pivot ;
		}
		
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

}
