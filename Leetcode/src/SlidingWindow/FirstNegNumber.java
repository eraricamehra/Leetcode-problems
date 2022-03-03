package SlidingWindow;

public class FirstNegNumber {

	public int[] firstNegNumberInWindow(int[] A, int k) {

		int i = 0;
		int j = 0;
		int l = 0;
		int neg[] = new int[A.length];
		while (j < A.length) {

			while (j - i - 1 == k) {
				if (A[i] < 0) {
					neg[l] = A[i];
					l++;
					i++;
					break;
				}
				j++;
			}

			if (j - i + 1 > k)
				j++;
			else if (j - i + 1 < k)
				i++;

		}
		return neg;

	}

}
