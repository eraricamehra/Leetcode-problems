package arrays;

import java.util.Arrays;

public class HeightChecker {

	public int heightChecker(int[] heights) {
		int[] expected = heights;
		Arrays.sort(expected);
		int count = 0;

		for (int j = 0; j <= heights.length - 1; j++) {
			if (heights[j] != expected[j]) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

}
