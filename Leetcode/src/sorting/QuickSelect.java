package sorting;

public class QuickSelect {
	
	  private int quickSelect(int[] nums, int start, int end, int k) {
	        if (start >= end) return nums[start];
	        int l = start, r = end;
	        int pivot = nums[l + (r - l) / 2];
	        while (l <= r) {
	            while (l <= r && nums[l] > pivot) {
	                l++;
	            }
	            while (l <= r && nums[r] < pivot) {
	                r--;
	            }
	            if (l <= r) {
	                int tmp = nums[l];
	                nums[l] = nums[r];
	                nums[r] = tmp;
	                l++;
	                r--;
	            }
	        }
	        
	        if (k - 1 <= r - start) {
	            return quickSelect(nums, start, r, k);
	        }
	        if (l - start <= k - 1) {
	            return quickSelect(nums, l, end, k - (l - start));
	        }
	        return nums[r + 1];
	    }

}
