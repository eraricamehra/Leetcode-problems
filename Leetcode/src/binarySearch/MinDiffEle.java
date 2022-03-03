package binarySearch;

//Find minimum difference element in a sorted array
//Find floor and ceil and return the minimum
//or let the binary search complete and compare high and low
//abs(arr[high] -key) or abs(arr[low] - key)
public class MinDiffEle {

	public int findMinDiffElement(int[] arr, int target) {
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == target)
				return mid;
			else if (arr[mid] < target) {
				low = mid + 1;
			} else
				high = mid - 1;
		}
		
		return (Math.abs(arr[high] - target) < Math.abs(arr[low]-target)) ? high: low;
	}

}
