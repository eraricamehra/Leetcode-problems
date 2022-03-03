package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		if (nums.length < 3)
			return result;
		for (int i = 0; i <= nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int j = i + 1, k = nums.length - 1;

				while (j < k) {

					if (nums[i] + nums[j] + nums[k] == 0) {
						result.add(Arrays.asList(nums[i], nums[j], nums[k]));
						while (nums[j] == nums[j + 1])
							j++;
						while (nums[k] == nums[k - 1])
							k--;
						j++;
						k--;
					} else if (nums[i] + nums[j] + nums[k] < 0) {
						j++;

					} else
						k--;
				}
			}
		}

		return result;

	}

}
