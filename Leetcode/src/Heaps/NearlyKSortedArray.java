package Heaps;

import java.util.PriorityQueue;

//K sorted array
public class NearlyKSortedArray {

	public void sort(int[] arr, int k) {
		
		PriorityQueue<Integer>  pq =new PriorityQueue<>();
		int index =0;
		int[] result = new int[arr.length];
		for(int i=0; i< arr.length; i++) {
			pq.add(arr[i]);
			
			if(pq.size() > k) {
				result[index] = pq.poll();
				index++;
			}
		}
		
		while(!pq.isEmpty()) {
			result[index] = pq.poll();
			index++;
		}
		
		for(int i =0; i< result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	
}
