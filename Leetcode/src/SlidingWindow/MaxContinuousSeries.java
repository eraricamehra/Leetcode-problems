package SlidingWindow;

import java.util.ArrayList;

public class MaxContinuousSeries {
	
	
	public int maxContinuousSeries(ArrayList<Integer> a) {
		if(a.size() ==0) return 0;
		int maxSize =0;
		int currentSize =0;
		for(int i=0; i<a.size(); i++) {
			
			if(a.get(i) == 1) {
				currentSize ++;
			}
			else {
				currentSize =0;
			}
			maxSize = Math.max(currentSize, maxSize);

			
		}
		return maxSize;

	}

}
