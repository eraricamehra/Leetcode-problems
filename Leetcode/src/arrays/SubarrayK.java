package arrays;

public class SubarrayK {

	public int subarraySum(int[] nums, int k) {
		int count = 0;
		int sum = 0;
		int i = 0, j = i+1;
		while (i < nums.length) {
			
			sum = sum + nums[j];
			if (sum < k) {
				i++;
			} else if (sum == k) {
				count++;
				
			} else {
				i++;
				
			}
		}
		return count;
	}
}
