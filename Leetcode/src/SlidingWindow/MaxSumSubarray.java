package SlidingWindow;

public class MaxSumSubarray {
	
	public int getMaxSum(int[] a, int k) {
		int sum=0;
		int max =0;
		for (int i=0; i<=a.length-1; i++) {
			sum = sum + a[i];
			if(i >= k-1) {
				max = Math.max(max, sum);
				sum = sum - a[i-(k-1)];
			}
		}
		return max;
	}

}
