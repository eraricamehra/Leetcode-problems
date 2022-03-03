package binarySearch;

public class PeakElement {

	public int findPeakElement(int[] nums) {
		if (nums.length - 1 == 0)
			return 0;
		int start = 0, end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			int next = (mid != nums.length - 1) ? mid + 1 : mid;
			int prev = (mid != 0) ? mid - 1 : mid;

			if (nums[mid] >= nums[prev] && nums[mid] >= nums[next])
				return mid;
			else if (nums[mid] < nums[prev])
				end = mid - 1;
			else if (nums[mid] < nums[next])
				start = mid + 1;
		}

		return -1;
	}

	// another solution

//	 public int findPeakElement(int[] nums) {
//	        if(nums.length-1 == 0) return 0;
//	        int start = 0, end = nums.length-1;
//	        
//	       	while(start< end) {
//				int mid = start + (end-start)/2;
//				if(nums[mid] < nums[mid+ 1]) start = mid +1;
//	            else end = mid;
//			}
//
//	        return start;
//	    }
}
