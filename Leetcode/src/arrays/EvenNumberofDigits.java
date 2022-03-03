package arrays;
//Given an array nums of integers, return how many of them contain an even number of digits.

public class EvenNumberofDigits {

	public int findNumbers(int[] nums) {
       int count= 0;
       int noOfDigits = 1;
       if(nums.length == 0) return 0;
       for(int i=0; i< nums.length; i++) {
    	   int element = nums[i];
    	   noOfDigits = 1;
    	   while (element/10 != 0) {
    		   element = element/10;
    		   noOfDigits++;
    	   }
    	   if(noOfDigits%2==0) {
    		   count ++;
    	   }
       }
       return count;
	}
}
