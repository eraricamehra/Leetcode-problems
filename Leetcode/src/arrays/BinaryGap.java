package arrays;

public class BinaryGap {
	 public int binaryGap(int n) {
		 
	        String binary=Integer.toBinaryString(n);
	        int dist =0;
	        int j=0;
	        for(int i =0; i<binary.length(); i++) {
	            if(binary.charAt(i) == '1') {
	                j=i+1;
	                while(j< binary.length()) {
	                    if(binary.charAt(j) =='1') {
	                        dist = Math.max(dist, j-i);
	                        break;
	                    }
	                    else {
	                        j++;
	                    }
	                }
	            }
	        }
	       return dist;
	   } 

}
