package SlidingWindow;

import java.util.ArrayList;

public class MaxConsecutive1 {
	
	public int maxConsecultiveOnes(int[] a, int k) {
		int i=0;
		int j =0;
		while(i<a.length) {
			if(a[i] == 0) k--;
			if(k < 0) {
				if(a[j] ==0) {
				 k++;	
				}
				j++;
			}
			i++;
			
		}
		System.out.println("From " + (i-1) + " to " +j );
		return i-j;
	}
	

}
