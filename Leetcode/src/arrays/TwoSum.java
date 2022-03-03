package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
	//Brute force
	public int[] twoSum(int[] nums, int target) { 
		int j=0;
		
		for(int i=0; i< nums.length; i++) {
			 j=i+1;
			 while(j<nums.length && i< nums.length) {
				 if(nums[i] + nums[j] == target) 
					 return new int[] {i,j};
				 else j++;
			 }
		}
		return new int[] {-1,-1};
	}
	//using hashmaps
	public int[] twoSumUsingHashMap(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i <= nums.length - 1; i++) {
			if (map.containsKey(nums[i])) {
				
                return new int[] {map.get(nums[i]), i} ;
			} else {
				map.put(target - nums[i], i);
			}
		}
		return new int[] {-1,-1};
	}
	
	public static List<Integer> findSongs(int rideDuration, List<Integer> songDurations) {
		 if(rideDuration < 30)  return Arrays.asList(new Integer[] {-1,-1});
		    int x = rideDuration - 30;
		    List<Integer> res = new ArrayList<>();
//		    res=-1;
//		    res[1]=-1;
		    int max = Integer.MIN_VALUE;
		    Map<Integer, Integer> m = new HashMap<>();
		    for(int i=0;i<songDurations.size();i++){
		        if(m.containsKey(x-songDurations.get(i)) && i!= m.get(x-songDurations.get(i)) 
		        &&(max < Math.max(songDurations.get(i),x-songDurations.get(i))) ){
		        	res.add(m.get(x-songDurations.get(i)));
		            res.add(i);
		            max = Math.max(songDurations.get(i),x-songDurations.get(i));
		        }
		        m.put(songDurations.get(i), i);
		    }
		    return res;
	}
}
