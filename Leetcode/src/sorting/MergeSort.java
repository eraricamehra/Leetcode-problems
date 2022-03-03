package sorting;


public class MergeSort {
	
	public int[] mergesort(int[] arr) {
		int[] temp = new int[arr.length];
		sort(arr, temp , 0, arr.length - 1);
		for (int l =0 ; l<arr.length; l++) {
			System.out.print(arr[l] + ", ");
		}
		return arr;
	}
	
	public void sort(int arr[], int[] temp, int start, int end) {
		if(end> start) {
			int mid = (start+ end)/2;
			sort(arr, temp, start, mid);
			sort(arr, temp, mid+1, end);
			merge(arr, temp, start, mid+ 1, end);
		}
		
	}
	
//	public void merge(int arr[], int start,int mid,  int end) {
//		int temp[] = new int[end -start +1];
//		
//		int i= start; int j = mid + 1;
//		int k=0;
//		while (i<=mid && j <=end) {
//			if(arr[i]< arr[j]) {
//				temp[k] = arr[i];
//				i++; 
//			} else {
//				temp[k] = arr[j];
//				j++; 
//			}
//			k++;
//		}
//		
//		while(i<=mid) {
//			temp[k] = arr[i];
//			i++; k++;
//		}
//		
//		while (j<=end) {
//			temp[k] = arr[j];
//			j++; k++;
//		}
//		
//		for (int l =start ; l<=end; l++) {
//			arr[l] = temp[l-start];
//		}
//		
//	}
	
	
	public void merge(int arr[], int start,int mid,  int end) {
		
		int i= start; int j = mid + 1;
		int element =0;
		while (i<=mid && j <=end) {
			if(arr[i]< arr[j]) {
				i++; 
			} else {
				element = arr[j];
    			while(j >= 0 && element <=  arr[j]) {
    				arr[j+1] = arr[j];
    				j--;
    			}
    			arr[i] = element;
    			j++; 
			}
		}
		
		
	}
	
	
	public void merge(int arr[], int[] temp, int start,int mid,  int end) {
		int leftEnd = mid -1;
		int k=start;
		int size = end - start + 1;
		
		
		while(start<= leftEnd && mid <= end) {
			if(arr[start] <= arr[mid]) {
				temp[k] = arr[start];
				k++;
				start++;
			} else {
				temp[k] = arr[mid];
				k++;
				mid++;
			}
		}
		
		while(start<= leftEnd) {
			temp[k] = arr[start];
			k++;
			start++;
		}
		
		while(mid <= end) {
			temp[k] = arr[mid];
			k++;
			mid++;
		}
		
		System.out.println("_________________________");
		
		for(int i=0; i< size; i++ ) {
			arr[end] = temp[end];
			end = end -1;
		}
		
		
	}

	

}
