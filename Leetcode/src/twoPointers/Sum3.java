package twoPointers;

import java.util.ArrayList;
import java.util.Collections;

public class Sum3 {
	
	 public int threeSumClosest(ArrayList<Integer> A, int B) {
		 Collections.sort(A);
		 if(A==null || A.size() < 3) return 0;

			double result = A.get(0) + A.get(1) + A.get(2);
			for (int i = 0; i < A.size() - 2; i++) {
				int start = i + 1;
				int end = A.size() - 1;
				while (start < end) {
					double sum = A.get(i) + A.get(start) + A.get(end);
					if (Math.abs(sum - B) < Math.abs(result - B)) {
						result = sum;
					}
					if(sum == B) return (int)sum;
					else if (sum < B)
						start++;
					else
						end--;
				}
			}
			return (int)(result);
		}

}
