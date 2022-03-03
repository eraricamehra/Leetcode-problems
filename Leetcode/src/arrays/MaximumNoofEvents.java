package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumNoofEvents {
//	You are given an array of events where events[i] = [startDayi, endDayi]. Every event i starts at startDayi and ends at endDayi.
//	You can attend an event i at any day d where startTimei <= d <= endTimei. You can only attend one event at any time d.
//	Return the maximum number of events you can attend.
	
	//brute force
	public int maxEvents(int[][] events) {

		Set<Integer> daysAttended = new HashSet<>();
		// sort by end day
		Arrays.sort(events, (a, b) -> (a[1] - b[1]));
		// iterate through the array
		for (int i = 0; i < events.length; i++) {
			int startDay = events[i][0];
			int endDay = events[i][1];
			for (int j = startDay; j <= endDay; j++) {
				// add if not present
				if (daysAttended.add(j)) {
					break;
				} else continue;
			}
		}
        System.out.println(daysAttended.size());
		return daysAttended.size();

	}

}
