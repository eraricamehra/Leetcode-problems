package practise;


import java.util.HashSet;


public class MissingPositive {

	public int solution(int[] A) {
		int ans = 0;
		HashSet<Integer> number = new HashSet<>(); // sort will happen
		int a = A.length;

		for (int i : A) {
			number.add(i);
			if (a == 1) {
				if ((i == 1) || (i == 0)) {
					return i + 1;
				}
			}
		}

		for (int i = 1; i <= a + 1; i++) {
			if (!number.contains(i)) {
				ans = i;
				break;
			}

		}
		return ans;
	}

}
