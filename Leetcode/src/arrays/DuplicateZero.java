package arrays;

public class DuplicateZero {
	
	public void duplicateZeros(int[] arr) {
		int current = 0;
		for (int i =0; i< arr.length-1; i++) {
			if(arr[i] ==0) {
				current = i+1;
				shift(arr, current);
				arr[i]=0;
				arr[i+1]=0;
				i=current;
				
			}
		}
		for (int i =0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
    }
	
	
	public int[] shift(int [] arr, int current) {
		for(int j = arr.length-1; j> current; j--) {
			arr[j] = arr[j-1];
		}
		
		return arr;
	}

}
