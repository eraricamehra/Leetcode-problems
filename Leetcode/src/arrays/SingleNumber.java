package arrays;
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.


//TODO solve again with xor^
public class SingleNumber {
	
	public int singleNumber(int[] nums) {
		int singleNum = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			singleNum = nums[i];
			int count =0;
			for (int j = 0; j <= nums.length - 1; j++) {
				if (nums[i] == nums[j]) {
					count++;
					if(count>=2) break;
				}
			}
			if(count==1) return singleNum;
		}
		return singleNum;

    }

}
