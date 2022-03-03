package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallAndKLarge {
	
	public int kLarge(int[] arr, int k) {
		PriorityQueue<Integer>  heap = new PriorityQueue<>();
		for(int i =0; i< arr.length; i++) {
			heap.add(arr[i]);
			if(heap.size() > k) 
				heap.remove();
		}
		
		return heap.remove();
	}
	
	public int kSmall(int[] arr, int k) {
		PriorityQueue<Integer>  heap = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i =0; i< arr.length; i++) {
			heap.add(arr[i]);
			if(heap.size() > k) 
				heap.remove();
		}
		return heap.remove();
	}

}
