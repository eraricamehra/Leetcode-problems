package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

//Given a string, find the length of the longest substring T that contains at most k distinct characters.
public class LongestSubstringWithKDistinct {

	public int longestSubstring(String str, int K) {
		
		int j =0;
		int maxSubstring =0;
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i< str.length() ; i++) {
			
			map.put(str.charAt(i), i);
			System.out.println(map);
			
			if(map.size() == K) {
				maxSubstring = Math.max(maxSubstring, (i-j) + 1);
			} else if (map.size() > K){
				//remove one element
				//j= j+ map.

				map.remove(str.charAt(j));
			}
		}
		return maxSubstring;
		
	}

}
