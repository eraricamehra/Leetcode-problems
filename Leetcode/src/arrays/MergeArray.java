package arrays;

public class MergeArray {

	public void merge(int[] x, int m, int[] y, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m + n; j++) {
					
				if (y[i] <= x[j] || x[j] ==0) { 
					System.out.println("comparing " + y[i] +" " + x[j]);

					shift(x, j);
					x[j] = y[i];
					break;
				}
			}
		}

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

	}
	
//	public void merge(int[] big, int m, int[] y, int n) {
//
//		for (int i = m, j = 0; i < m + n && j < n; i++, j++) {
//			big[i] = y[j];
//		}
//		sort(big, m, n);
//		for (int i = 0; i < big.length; i++) {
//			System.out.println(big[i]);
//		}
//
//	}

	public int[] shift(int[] arr, int current) {
		for(int i = arr.length-2; i >= current; i--) {
			arr[i+1] = arr[i];
		}
		return arr;
	}

	public void sort(int[] big, int m, int n) {
		int max;
		for(int i=0; i<big.length-1; i++) {
			System.out.println("comparing " + big[i] +" " + big[i+1]);
			if(big[i] > big[i+1]) {
				max= big[i];
				big[i] = big[i+1];
				big[i+1]= max;
			}
		}
	}
	
}
