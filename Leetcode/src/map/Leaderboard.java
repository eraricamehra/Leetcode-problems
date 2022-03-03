package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leaderboard {
    private Map<Integer, Integer> scores;
    //PriorityQueue<Integer> pq;

    public Leaderboard() {
        scores= new HashMap<>();
        //pq = new  PriorityQueue<Integer>(Comparator.reverseOrder());
    }
    
    public void addScore(int playerId, int score) {
    	if(!scores.containsKey(playerId))  {
    		 scores.put(playerId, 0);
    	} 
        scores.put(playerId, scores.getOrDefault(playerId, 0) + score);      
    }
    
    public int top(int K) {
        int sum =0;
        System.out.println(scores.size());
        //PriorityQueue<Integer> pq = new  PriorityQueue<Integer>((a,b) ->  scores.get(b) - scores.get(a));
        PriorityQueue<Integer> pq = new  PriorityQueue<Integer>(Comparator.reverseOrder());
        for(Integer score: scores.values()) {
            pq.add(score);
            //if(pq.size() > K) pq.poll();
        }
        for(int i=0; i<K; i++) {
            sum+= pq.poll();
        }
        return sum;
    }
    
    public void reset(int playerId) {
        int currentScore = scores.get(playerId);
        scores.put(playerId , 0);
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */