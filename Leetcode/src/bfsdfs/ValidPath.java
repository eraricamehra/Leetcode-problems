package bfsdfs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ValidPath {

	public boolean validPath(int n, int[][] edges, int source, int destination) {

		// create a graph
		List<List<Integer>> graph = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new LinkedList<>());
		}

		// add edges
		for(int[] e : edges){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

		printGraph(graph);
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(source);
	    boolean[] visited = new boolean[n];
		visited[source] =  true;

		while (!queue.isEmpty()) {
			int next = queue.poll();
			if (next == destination)
				return true;

//        	Iterator<Integer> i = graph.get(next).listIterator();
//        	while(i.hasNext()) {
//        		int child = i.next();
//        		if(!visited[child]) {
//        			queue.add(child);
//        			visited[child] = true;
//        		}
//        		
//        	}
			for (Integer i : graph.get(next)) {
				if (!visited[i]) {
					queue.add(i);
					visited[i] =  true;

				}
			}

		}

		return false;

	}

	public void printGraph(List<List<Integer>> graph) {
		System.out.println("Length is" + graph.size());
		for (int row = 0; row < graph.size(); row++) {
			for (int col = 0; col < graph.size(); col++) {
				System.out.print(graph.get(row).get(col) + " ");
			}
			System.out.println();
		}
	}

}
