package arrays;

//Given a 0-indexed integer array nums of size n, 
//find the maximum difference between nums[i] and nums[j] 
//(i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].

//ex: [3,5, 1,9,2,10] -----> 9

//approach 1: brute force
public class MaxDiffIncElement {

	public int maximumDifference(int[] nums) {
		int max = -1;
		for (int i = 0; i < nums.length - 1; i++) {
			int j = i + 1;
			while (i < j && j < nums.length) {
				if (nums[j] > nums[i])
					max = Math.max(nums[j] - nums[i], max);
				j++;
			}
		}
		return max;
	}

	// Approach 2: One loop only
	public int maximumDifferences(int[] nums) {
		int max = -1;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] > nums[i])
				max = Math.max(nums[j] - nums[i], max);
			else
				i++;
		}
		return max;

	}

}
