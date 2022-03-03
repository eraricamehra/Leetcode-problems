package arrays;

public class CheckDouble {
	public boolean checkIfExist(int[] arr) {
		if(arr.length == 0 || arr == null || arr.length == 1) return false;
		int element;
		for (int i = 0; i < arr.length; i++) {
			element = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (element == 2 * arr[j] || arr[j] == 2 * element) {
					return true;
				}
			}
		}
		return false;
	}

}
