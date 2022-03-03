package sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public void sort(int[] arr) {
		
		for(int i = 1; i<= arr.length-1; i++) {
			int j = i - 1;
			int element = arr[i];
			while(j >= 0 && element <=  arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
		}
		
		
		for(int i = 0; i<= arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}

}
