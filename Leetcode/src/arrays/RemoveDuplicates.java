//Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

package arrays;

public class RemoveDuplicates {

	// Beats 100% java submission
	public int removeDuplicatesInPlace(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 1;
		int i = 0;
		int result = nums.length;
		for (int j = 1; j <= nums.length - 1; j++) {
			if (nums[i] < nums[j]) {
				nums[i + 1] = nums[j];
				i++;
			} else {
				result--;
			}
		}
		return result;
	}

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 1;
		int result = nums.length;
		for (int i = 0; i < result - 1; i++) {
			int element = nums[i];
			for (int j = i + 1; j <= result - 1; j++) {
				if (element == nums[j]) {
					leftShift(nums, j);
					j--;
					result--;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		return result;
	}

	public int[] leftShift(int[] arr, int current) {
		for (int i = current; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;
		return arr;
	}

}
