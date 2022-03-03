package binarySearch;

public class SearchInRotatedArrayTwo {

	public boolean search(int[] nums, int target) {
		if (nums.length == 0)
			return false;
		int start = 0, end = nums.length - 1;
		if (nums.length == 1 && target == nums[0]) {
			return true;
		}
		if (nums.length == 1 && target != nums[0]) {
			return false;
		}

		while (start < end && nums[start] == nums[start + 1])
			start++;
		while (start < end && nums[end] == nums[end - 1])
			end--;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target)
				return true;
			else if (nums[mid] > target) {
				if (nums[start] > nums[mid] || nums[start] <= target)
					end = mid - 1;
				else
					start = mid + 1;
			} else {
				if (nums[start] <= nums[mid] || nums[start] > target)
					start = mid + 1;
				else
					end = mid - 1;
			}
		}

		return false;

	}

}
