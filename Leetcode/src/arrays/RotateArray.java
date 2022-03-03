package arrays;

public class RotateArray {

	public void rotate(int[]  arr) {
		int prev = arr[0];
		int next;
		
		for (int i =1; i< arr.length; i++) {
			next = arr[i];
			arr[i] = prev;
			prev = next;
		}
		
		arr[0] = prev;
		System.out.println("Shifted");
		
		for (int i =0; i< arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
