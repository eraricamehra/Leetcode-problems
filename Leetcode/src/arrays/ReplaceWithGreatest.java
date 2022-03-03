package arrays;
//Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

public class ReplaceWithGreatest {

	public int[] replaceElements(int[] arr) {
		
		if(arr.length ==0) return new int[0];
		int i =0;
		while(i<arr.length -1)
		{
			int max=arr[i+1];
			if(i==arr.length-2) {
				max=arr[arr.length-1];
			}
			for (int j=i+1;j< arr.length -1; j++ ) {
				max = Math.max(max, arr[j+1]);
			}
			arr[i]=max;
			i++;
		}
			arr[arr.length-1]=-1;
		for (int j =0; j< arr.length; j++) {
			System.out.println(arr[j]);
		}
		return arr;

	}
	
	
public int[] replace(int[] arr) {
		
		if(arr.length ==0) return new int[0];
		int i =arr.length-1;
		int right = -1;
		while(i>=0)
		{
			int max = Math.max(right, arr[i]);
			arr[i] = right;
			right = max;
			i--;
		}
			arr[arr.length-1]=-1;
		for (int j =0; j< arr.length; j++) {
			System.out.println(arr[j]);
		}
		return arr;

	}

}
