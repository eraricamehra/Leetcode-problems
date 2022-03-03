package arrays;

//TODO: improve code
public class MountainArray {

	public boolean validMountainArray(int[] arr) {
		if (arr.length < 3 || arr == null)
			return false;
//		for (int i = 1; i < arr.length - 1; i++) {
//			if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) 
//				return verify(arr, i);
//			    
//		}
		int i = 1;
		while (i < arr.length && arr[i] > arr[i-1]) {
			i++;
		}
		while (i <arr.length-1 && arr[i] >arr[i+1]) {
			i++;
		}
		if(i==arr.length-1) return true;
		return false;

	}

	public boolean verify(int[] arr, int index) {
		for (int i = 1;  i < index ; i++) {
			if((arr[i]<= arr[i-1])) return  false;
		}
		for (int j= arr.length-1;  j>= index+1;  j--) {
			if((arr[j] >= arr[j-1])) return  false;
		}
		
		return true;
	}
	
}
