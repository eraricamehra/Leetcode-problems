package Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class FrequencySort {

	public String frequencySort(String s) {

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}

		PriorityQueue<Map.Entry<Character, Integer>> minheap = new PriorityQueue<>(
				(n1, n2) -> n2.getValue() - n1.getValue());

		minheap.addAll(map.entrySet());
		System.out.println(minheap);
		//int index = 0;
		StringBuilder result = new StringBuilder();
		while (!minheap.isEmpty()) {
			Entry<Character, Integer> entry = minheap.poll();
			char key = entry.getKey();
			int v = entry.getValue();
			while (v > 0) {
				result.append(key);
				v--;
			}
		}
		return result.toString();
	}
	
	
	public String frequencySort2(String s) {

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}

		PriorityQueue<Character> minheap = new PriorityQueue<>(
				(n1, n2) -> map.get(n2) - map.get(n1));
		minheap.addAll(map.keySet());
		for(char c: map.keySet()) {
            minheap.offer(c);
        }
		
		StringBuilder result = new StringBuilder();
		while (!minheap.isEmpty()) {
			char c  =  minheap.poll();
			int value = map.get(c);
			while (value > 0) {
				result.append(c);
				value--;
			}

		}

		return result.toString();

	}

}
