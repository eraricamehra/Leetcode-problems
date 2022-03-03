package arrays;

import java.util.Arrays;

public class Median {

	public double getMedian(int[] arr) {

		Arrays.sort(arr);
		if (arr.length % 2 == 0) {
			double median = (arr[(arr.length / 2) - 1] + arr[(arr.length / 2)]) / 2.0;
			return median;

		} else {
			return arr[arr.length / 2];
		}
	}

}
