package bfsdfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	private int N; // number of vertices
	private LinkedList<Integer> adj[];

	@SuppressWarnings("unchecked")
	public BFS(int v) {
		N = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++)
			adj[i] = new LinkedList<>();
	}

	public void addEdge(int i, int j) {
		adj[i].add(j);
	}

	public String bfs(int source, int key) {

		boolean[] visited = new boolean[N];

		Queue<Integer> queue = new LinkedList<>();
		queue.add(source);
		visited[source] = true;

		while (queue.size() != 0) {
			// Dequeue a vertex from queue and print it
			source = queue.poll();
			System.out.print(source + " ");
			if (source == key)
				return "Found";

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			
			Iterator<Integer> i = adj[source].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
		return "Not Found";
	}

}
