package Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms {

	public int minMeetingRooms(int[][] intervals) {

		// create PQ min heap wrt end times
		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>((a, b) -> (a - b));
		// sort the array with respect to start time

//		Arrays.sort(intervals, new Comparator<int[]>() {
//			@Override
//			public int compare(int[] a, int[] b) {
//				return a[0] - b[0];
//			}
//		}); 
		Arrays.sort(intervals, (a,b) -> (a[0]-b[0]));
		minheap.add(intervals[0][1]);

		for (int i = 1; i < intervals.length; i++) {

			if (intervals[i][0] >= minheap.peek()) {
				minheap.poll();
			} //else {
				//count++;
			//}
			minheap.add(intervals[i][1]);

		}

		return minheap.size();

	}

}
