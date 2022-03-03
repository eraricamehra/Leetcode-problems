package arrays;

public class SqrtRoot {
	
	 public int mySqrt(int x) {
	        int i=1;
	        int res =0;
	        if(x==0) return 0;
	        if(x==1) return 1;
	        
			//while (res <= x) {
	      //       i++;
	       //     res = i * i;
	      // }
	        int start =1, end = x;
	        while(start<=end) {
	            int mid = start + (end -start)/2;
	            if(mid*mid ==x) return mid;
	            else if(x < mid * mid) end = mid -1;
	            else start = mid +1;
	        }
	        System.out.println("Start" + start);
	        System.out.println("End" + end);

	       // return i-1;
	        return end;
	    }

}
