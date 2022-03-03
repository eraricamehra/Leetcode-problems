package Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequency {

	public int[] topKFrequent(int[] nums, int k) {

        if(nums.length < 2) return nums;
        
    	Map<Integer, Integer>  freqMap = new HashMap<>();
    	
    	for (int i = 0; i < nums.length; i++) {
			freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
		}
     	//using comparator
    	PriorityQueue<Map.Entry<Integer, Integer>> minheap = new PriorityQueue<>((n1,n2) -> n2.getValue() - n1.getValue());
    	minheap.addAll(freqMap.entrySet());
    	
    	int[] result = new int[k];
    	int index =0;
    	    while(!minheap.isEmpty() && index<k) {
    		result[index] = minheap.poll().getKey();
    		index++;
    	}
    	
    	for(int i=0; i< result.length; i++) {
    		System.out.print(result[i] + ", ");
    	}
    	return result;

	}


}
