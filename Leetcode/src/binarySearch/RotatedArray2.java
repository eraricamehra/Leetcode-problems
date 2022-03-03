package binarySearch;

public class RotatedArray2 {
	
	 public boolean search(int[] arr, int target) {
		 int start = 0, end = arr.length - 1;
		 while(start<end && arr[start] == arr[start+1]) start ++;
		 while(start<end && arr[end] == arr[end-1]) end --;
	     int mid = start + (end - start) / 2;
	     if(arr[mid] == target) return true;
	     else if(arr[mid] > target) {
	    	 if(arr[start] > arr[mid] || arr[start] <=target)
	    		 end = mid -1;
	    	 else start = mid + 1;
	     } else {
	    	 if(arr[start] <= arr[mid] || arr[start] > target)
	    		 start = mid+1;
	    	 else end = mid -1;
	     }

		 return false;
		 
//		 int mid = getRotationCount(arr, start, end);
//			System.out.println("The mid is " + mid);
//			int result;
//			if(target == arr[mid]) return true;
//			else if(target > arr[mid] && target <= arr[arr.length-1]) {
//				result = binarySearch(arr, target, mid , arr.length-1);
//
//			} else {
//				result = binarySearch(arr, target, 0, mid -1);
//			}
	        //return (result > -1)?true: false;
	    }
	   
	    public int binarySearch(int[] arr, int target, int start, int end) {
			//int start = 0, end = arr.length - 1;

			while (start <= end) {
				int mid = start + (end - start) / 2;

				if (arr[mid] == target)
					return mid;
				else if (target > arr[mid]) {
					start = mid + 1;
				} else if (target < arr[mid]) {
					end = mid - 1;
				}
			}
			return -1;
		}
	    
	    public int getRotationCount(int[] arr, int start, int end) {
			int len = arr.length-1;
			while (start <= end) {
				int mid = start + (end - start) / 2;
				
				int next = (mid + 1)% len;
				int prev = (mid +len -1) %len;	
				
				if(arr[mid] <=arr[prev] && arr[mid] <= arr[next])
		        	return mid;
		        else if(arr[end] < arr[mid]) 
		        	start = mid +1;
		        else end = mid -1;
			}
	        return -1;

		}

}
