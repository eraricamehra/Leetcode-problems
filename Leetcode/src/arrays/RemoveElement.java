package arrays;

import java.util.Arrays;

public class RemoveElement {
	
	// Better approach
	  public int removeValue(int[] nums, int val) {
		    if(nums.length == 0)  return 0;
		    int result =nums.length;
		    Arrays.sort(nums);
		    int i =0;
		    for(int j =0; j <= nums.length-1; j++) {
		    	if(nums[j] != val) {
		    		nums[i] = nums[j];
		    		i++;
		    	} else  {
		    		result --;
		    	}
		    }
		    //Not necessary
		    for(int j =nums.length -1; j >= result; j--) {
		    	nums[j]=0;
		    }
		    for (int k = 0; k < nums.length; k++) {
				System.out.println(nums[k]);
			}
		    return result;
		  
	  }

		  

  public int removeElement(int[] nums, int val) {
	    int result =nums.length;
        for(int i=0; i<=result -1; i++) {
        	if(nums[i]==val) {
        		nums= leftShift(nums, i);
        		result--;
        		i--;
        	}
        }
        
        for (int i =0; i< nums.length; i++) {
			System.out.println(nums[i]);
		}
    	return result;
    }
  
  public int[] leftShift(int[] arr, int current) {
	  for(int i=current; i<arr.length-1; i++) {
		  arr[i] = arr[i+1];
	  }
	  arr[arr.length-1] =0;
	  return arr;
  }
}
