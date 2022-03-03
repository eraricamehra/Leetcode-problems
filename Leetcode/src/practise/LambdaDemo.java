package practise;

public class LambdaDemo {
	
	@FunctionalInterface
	public interface GreatDivide {
		int divide(int t1, int t2);
	}
	
	
	public void simpleLambda() {
		GreatDivide intdinvide = (int x, int y) -> x/y;
		System.out.println(intdinvide.divide(21, 7));
	}

}
