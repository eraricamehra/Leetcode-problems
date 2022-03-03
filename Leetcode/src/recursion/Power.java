package recursion;

public class Power {

	public double myPow(double x, int n) {
		double result = recursion(x, Math.abs(n));
		return (n < 0) ? 1 / result : result;
	}

	public double recursion(double x, int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return x;
		if (n % 2 == 0)
			return recursion(x * x, n / 2);
		return x * recursion(x * x, n / 2);
	}

}
