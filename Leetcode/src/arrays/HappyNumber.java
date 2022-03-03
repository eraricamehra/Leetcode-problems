package arrays;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	// brute force
	public boolean isHappy(int n) {
		Set<Integer> visited = new HashSet<>();
		while (n != 1 && !visited.contains(n)) {
			visited.add(n);
			n = getNumber(n);
		}
		if (n == 1)
			return true;
		return false;
	}

	// optimal
	public boolean isHappy2(int n) {
		int slow = n, fast = getNumber(n);
		while (fast != slow && fast != 1) {
			slow = getNumber(slow);
			fast = getNumber(getNumber(fast));
		}
		if (fast == 1)
			return true;
		return false;

	}

	public int getNumber(int n) {
		int sum = 0;
		while (n > 0) {
			int d = n % 10;
			sum += d * d;
			n = n / 10;
		}
		return sum;
	}

}
