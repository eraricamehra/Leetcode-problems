package practise;

public class Chunks {

	public int solution(int[] A) {
		int n = A.length;
		if (n < 2)
			return 1;
		int[] temp = new int[n];
		temp[0] = A[0];
		int chunksCount = 0;
		for (int i = 1; i < n; i++) {
			if (A[i] >= temp[chunksCount]) {
				chunksCount++;
				temp[chunksCount] = A[i];
			} else {
				int max = temp[chunksCount];
				while (chunksCount >= 0 && temp[chunksCount] > A[i]) {
					chunksCount--;
				}
				chunksCount++;
				temp[chunksCount] = max;
			}
		}
		return chunksCount + 1;
	}

}
