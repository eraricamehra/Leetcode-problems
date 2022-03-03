package SlidingWindow;

//Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.

public class MinSizeSubarry {

	public int minSubArrayLen(int target, int[] nums) {

		int j = 0;
		int sum = 0;
		int minSize = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {

			sum += nums[i];
			while (sum >= target) {
				minSize = Math.min(minSize, (i - j) + 1);
				sum -= nums[j];
				j++;
			}
		}
		if(minSize == Integer.MAX_VALUE) return 0;
		return minSize;

	}
}
