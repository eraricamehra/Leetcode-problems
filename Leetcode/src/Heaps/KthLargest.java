package Heaps;

import java.util.PriorityQueue;

//Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.

public class KthLargest {
	int k;
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

	public KthLargest(int k, int[] nums) {
		this.k = k;
		for (int n : nums)
			sort(k, n);
	}

	public int add(int val) {
		// nums[nums.length -1] = val;
		pq.offer(val);
		if (pq.size() > k)
			pq.poll();
		return pq.peek();
	}

	public void sort(int k, int val) {
		pq.offer(val);
		if (pq.size() > k)
			pq.poll();
	}
}
