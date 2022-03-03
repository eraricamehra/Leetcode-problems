package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.tuple.Pair;

//Given an array of integers nums and an integer k, 
//return the number of unique k-diff pairs in the array.

public class KDiffPairs {

	public int findPairs(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 0)
			return 0;
		Arrays.sort(nums);
		Set<Pair<Integer, Integer>> set = new HashSet<>();

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			j = i + 1;
			while (j < nums.length && i < nums.length) {
				if (nums[j] - nums[i] < k)
					j++;
				else if (nums[j] - nums[i] == k) {
					set.add(Pair.of(nums[i], nums[j]));
					break;
				} else
					break;
			}
		}
		return set.size();
	}

	public int findPairs2(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 0)
			return 0;

		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Integer i : map.keySet()) {
			if (k == 0 && (map.get(i) > 1)) {
				count++;
			} else if (k > 0 && map.containsKey(i + k)) 
					count++;
			
		}
		return count;
	}

}
