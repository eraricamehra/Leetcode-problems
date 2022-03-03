package arrays;
//Given a binary array nums, return the maximum number of consecutive 1's in the array.


public class ConsecutiveNumbers {
	
	public int findNumbers(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if(count>= max) 
                max = count;
        }
        return max;
}

}
