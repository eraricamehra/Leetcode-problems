package binarySearch;


//Monotonically increasing and then decreasing array
//1,3,5,12,4,2
//Same as peak array. But there is only one peak element
public class BitonicArray {

	public int peakIndexInMountainArray(int[] arr) {
        int start =0, end = arr.length-1;
        
        while(start<=end) {
            int mid = start + (end-start)/2;
            int prev = (mid != 0)? mid-1:mid;
            int next = (mid != arr.length-1) ? mid + 1: mid;
            
            if(arr[mid] >= arr[prev] && arr[mid] >= arr[next]) return mid;
            else if(arr[prev] > arr[mid]) end = mid -1;
            else  start = mid +1;
            
        }
        return -1;
        
    }
}
