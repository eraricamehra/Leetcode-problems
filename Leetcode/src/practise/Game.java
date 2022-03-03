package practise;

public class Game {

	public String solution(String S, int[] A) {
		if (A.length == 0)
			return "";
		char[] charArray = S.toCharArray();
		String result = String.valueOf(charArray[0]);
		int target = A[0];
		while (target != 0) {
			result = result + charArray[target];
			target = A[target];
		}
		return result;
	}

}
