package arrays;

public class ReverseArray {

	public void reverse(int[] nums, int start, int end) {
		int temp;
		while (start < end) {
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
