package arrays;

public class RemoveDuplicates2 {
	
	
	public int removeDuplicates(int[] nums) {
		if (nums.length < 2)
			return nums.length;

		int i = 2, j = 2;

		while (i < nums.length & j < nums.length) {
			if (nums[i - 2] != nums[j]) {
				nums[i] = nums[j];
				i++;
			}
			j++;
		}
		return i;
	}

}
