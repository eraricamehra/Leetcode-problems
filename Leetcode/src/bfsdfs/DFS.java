package bfsdfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DFS {

	
	private int N;
	private LinkedList<Integer> adj[];
	private boolean visited[];

	@SuppressWarnings("unchecked")
	public DFS(int v) {
		N = v;
		adj = new LinkedList[v];
		visited = new boolean[v];
		for (int i = 0; i < v; i++)
			adj[i] = new LinkedList<>();
	}

	public void addEdge(int i, int j) {
		adj[i].add(j);
	}
	
//	public String dfs(int source, int key) {
//		Stack<Integer> stack = new Stack<>();
//		stack.add(source);
//	    boolean[] visited = new boolean[N];
//		visited[source] =  true;
//
//		while (!stack.isEmpty()) {
//			int next = stack.pop();
//			if (next == key)
//				return "F";
//
//            Iterator<Integer> i = adj[next].listIterator();
//        	while(i.hasNext()) {
//        		int child = i.next();
//        		if(!visited[child]) {
//        			stack.add(child);
//        			visited[child] = true;
//        		}
//        		
//        	}
////			for (Integer i : adj.get(next)) {
////				if (!visited[i]) {
////					stack.add(i);
////					visited[i] =  true;
////
////				}
////			}
//
//		}
//
//		return "N F";
//	}
	
	 public boolean dfs(int source, int key, String result)
	 
	    {
		 Stack<Integer> stack = new Stack<>();
		 stack.add(source);
		    boolean[] visited = new boolean[N];
			visited[source] =  true;
            
			while (!stack.isEmpty()) {
				int next = stack.pop();
				System.out.print(next + " ");
				if (next == key)
					return true;

//	        	Iterator<Integer> i = graph.get(next).listIterator();
//	        	while(i.hasNext()) {
//	        		int child = i.next();
//	        		if(!visited[child]) {
//	        			queue.add(child);
//	        			visited[child] = true;
//	        		}
//	        		
//	        	}
				for (Integer i : adj[next]) {
					if (!visited[i]) {
						stack.add(i);
						visited[i] =  true;

					}
				}

			}
			return false;
	    }
	 
	
	
	
}
