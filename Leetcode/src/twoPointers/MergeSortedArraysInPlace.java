package twoPointers;

import java.util.ArrayList;

public class MergeSortedArraysInPlace {
	
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
    	int i=0, j=0; int element = 0;
    	while(i <= a.size()-1 && j <=b.size() -1) {
    		if(a.get(i) < b.get(j)) i++;
    		else {
    			element = b.get(j);
    			a.add(i, element); j++;
    		}
    	}
    	while(j<=b.size() -1) {
    		element = b.get(j);
    		a.add(i, element); j++;
    	}
    	a.forEach(e -> System.out.println(e));
    
    }
    
    
    public void merge(int[] a, int m, int[] b, int n) {
    	int i=0, j=0; int element = 0;
    	while(i <= m-1 && j <=n -1) {
    		if(a[i] < b[j]) i++;
    		else {
    			element = b[j];
    			while(j >= 0 && element <=  a[j]) {
    				a[j+1] = a[j];
    				j--;
    			}
    			a[i] = element;
    			j++;
    		}
    	}
    	while(j<=n -1) {
    		element = b[j];
    		while(j >= 0 && element <=  a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[i] = element;
            j++;
    	}
    	for(int l=0; l<=a.length -1; l++) System.out.println(a[l]);
    
    }

}
