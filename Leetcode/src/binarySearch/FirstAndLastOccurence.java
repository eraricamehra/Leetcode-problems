package binarySearch;

public class FirstAndLastOccurence {

	public int[] searchRange(int[] nums, int target) {

		int[] result = new int[2];
		result[0] = getFirstOccurrence(nums, target);
		result[1]=getLastOccurrence(nums, target)	;	
		return result;

	}
	
	public int getFirstOccurrence(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int firstOccurence = -1;
		int mid = 0;
		
		while (start <= end) {
			
			mid = start + (end - start) / 2;

			if (target == nums[mid]) {
				firstOccurence = mid;
				end = mid - 1;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return firstOccurence;

	}
	
	public int getLastOccurrence(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int lastOccurence = -1;
		int mid = 0;
		
		while (start <= end) {
			
			mid = start + (end - start) / 2;

			if (target == nums[mid]) {
				lastOccurence = mid;
				start = mid + 1;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return lastOccurence;

	}
	
	
	
	

}
