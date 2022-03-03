package Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {

	public String reorganizeString(String s) {

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}

		PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
		for (char c : map.keySet()) {
			maxHeap.offer(c);
		}

		StringBuilder result = new StringBuilder();
		while (maxHeap.size() > 1) {
			char current = maxHeap.poll();
			char next = maxHeap.poll();
			result.append(current);
			result.append(next);
			map.put(current, map.get(current) - 1);
			map.put(next, map.get(next) - 1);
			if (map.get(current) > 0) {
				maxHeap.add(current);
			}
			if (map.get(next) > 0) {
				maxHeap.add(next);
			}

		}
		if (!maxHeap.isEmpty()) {
			char last = maxHeap.poll();
			if (map.get(last) > 1)
				return "";
			result.append(last);
		}
		return result.toString();

	}
}
