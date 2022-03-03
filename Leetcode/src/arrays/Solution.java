package arrays;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
    	int missing =0;
    	int smallest =0;

        Arrays.sort(A);
        
        
        if(A[A.length-1] <0)  {
        	return 1;
        }
        for(int i=0; i < A.length-1; i++) {
        	if(A[i] < 0) {
        		A[i] =0;
        		smallest = A[i];
        	} else {
        		if(A[i-1] ==0 && A[i] > 0) return 0;
        		if(A[i]+1 < A[i+1])
        			smallest = A[i];
        	}
        }
        
        
        
        return smallest + 1;


    }
}