package SlidingWindow;

public class MaximumAverage {
	
	public double maxAverage(int[] A, int k) {
		
		double maxAverage = 0;
		double currentAvg =0;
	    int currentSum =0;
		for(int i=0; i< A.length; i++) {
			currentSum +=  A[i];
			if(i >= k-1) {
				currentAvg = currentSum/k;
				maxAverage = Math.max(currentAvg, maxAverage);
				currentSum -= A[i-(k-1)];
			}
		}
		 return maxAverage;
		
	}
	

}
