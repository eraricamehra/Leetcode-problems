package arrays;

import java.util.Arrays;

public class ThreeSumClosest {
	// Approach 1:
	// Iterate the i,j,k
	// for each sum find out distance between target and the new sum and compare
	// with the original value
	public int threeSumClosest(int[] nums, int target) {
		if (nums.length < 3)
			return -1;
		if (nums.length == 3)
			return nums[0] + nums[1] + nums[2];
		int sum = 0, closestSum = nums[0] + nums[1] + nums[2];
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					sum = nums[i] + nums[j] + nums[k];

					if (Math.abs(target - closestSum) >= Math.abs(target - sum))
						closestSum = sum;

				}
			}
		}
		return closestSum;

	}

	public int threeSumClosestOptimized(int[] nums, int target) {
		if (nums.length < 3)
			return -1;
		if (nums.length == 3)
			return nums[0] + nums[1] + nums[2];
		int sum = 0, closestSum = nums[0] + nums[1] + nums[2];
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int j = 1, k = nums.length - 1;

				while (i != j && j != k) {
					sum = nums[i] + nums[j] + nums[k];
					if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
						closestSum = sum;
						// System.out.println("New Closest Is " + closestSum );
					}
					if (sum < target) {
						j++;
					} else {
						k--;
					}
				}
			}
		}
		return closestSum;
	}

}
