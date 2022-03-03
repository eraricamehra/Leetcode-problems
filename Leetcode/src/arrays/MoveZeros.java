package arrays;
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.


public class MoveZeros {
   
	//Beats 100 %
	public int[] moveZeroess(int[] nums) {
		int zerosCount = 0;
		int i = 0;
		for (int j = 0; j <= nums.length - 1; j++) {
			if (nums[j] != 0) {
				nums[i] = nums[j];
				i++;
			} else {
				zerosCount++;
				// j--;
			}
		}

		int length = nums.length - 1 - zerosCount;
		for (int j = nums.length - 1; j > length; j--) {
			nums[j] = 0;
		}

		for (int k = 0; k <= nums.length - 1; k++) {
			System.out.println(nums[k]);
		}
		return nums;
	}

	public int[] moveZeroes(int[] nums) {
		int length = nums.length;
		for (int i = 0; i <= length - 1; i++) {
			if (nums[i] == 0) {
				nums = leftShift(nums, i);
				length--;
				i--;
			}
		}

		for (int i = 0; i <= nums.length - 1; i++) {
			System.out.println(nums[i]);
		}
		return nums;
	}

	public int[] leftShift(int[] arr, int current) {
		for (int i = current; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;
		return arr;
	}

}
