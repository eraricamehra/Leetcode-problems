package arrays;
//98 %
public class SortByParity {

	public int[] sortArrayByParity(int[] nums) {
		//logic 
//		element at i is even-> i++
//		element at i is odd and element at j is odd -> continue with the next iteration
//		element at i is odd and element at j is even -> swap and i++; 

		int i = 0;
		for (int j = 1; j <= nums.length - 1; j++) {
			if (nums[i] % 2 == 0) {
				i++;
			} else if (nums[i] % 2 != 0 && nums[j] % 2 != 0) {
				continue;
			} else if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				//j--;
			}
		}
		for (int j = 0; j <= nums.length - 1; j++) {
			System.out.println(nums[j]);
		}
		return nums;
	}
}
