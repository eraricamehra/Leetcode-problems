package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthFactor {

	//Approach 1
	public int kthFactor(int n, int k) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
				if (k == count) {
					return i;
				}
			}
		}
		return -1;
	}
	
	//Heap approach
	public int kthFactorHeap(int n, int k) {
		//int count = 0;
		PriorityQueue<Integer>  pq  = new PriorityQueue<Integer>(Comparator.reverseOrder()) ;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				//count++;
				pq.add(i);
				if (k == pq.size()) {
					return pq.poll();
				}
			}
		}
		return -1;
	}
}
