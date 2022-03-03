package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TweetCounts {

	Map<String, Integer> time = new HashMap<String, Integer>();
	Map<String, TreeMap<Integer, Integer>> treemap = new HashMap<>();

	public TweetCounts() {
		time.put("second", 1);
		time.put("minute", 60);
		time.put("hour", 3600);
		time.put("day", 86400);

	}

	public void recordTweet(String tweetName, int time) {
		if (!treemap.containsKey(tweetName)) {
			treemap.put(tweetName, new TreeMap<>());
		}

		TreeMap<Integer, Integer> tree = treemap.get(tweetName);
		tree.put(time, tree.getOrDefault(time, 0) + 1);

	}

	public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
		int timeVal = time.get(freq);

		int interval = (((endTime - startTime)) / timeVal) + 1;

		System.out.println("Interval: "+ interval);
		
		 TreeMap<Integer, Integer> tm =  treemap.get(tweetName);
		 List<Integer> result = new ArrayList<>();
		 int[] arr = new int[interval];
		 
		 
		 Set<Entry<Integer, Integer>> subMap  = tm.subMap(startTime, endTime + 1).entrySet();
		 //create submaps per interval add in array
		 result.add(subMap.size());
		 return result;

	}

	/**
	 * Your TweetCounts object will be instantiated and called as such: TweetCounts
	 * obj = new TweetCounts(); obj.recordTweet(tweetName,time); List<Integer>
	 * param_2 = obj.getTweetCountsPerFrequency(freq,tweetName,startTime,endTime);
	 */

}
