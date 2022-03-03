package bfsdfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


//cloneGraph
public class Node {

	public int val;
	public List<Node> neighbors;
	Map<Node, Node> visited = new HashMap<>();

	public Node() {
		val = 0;
		neighbors = new ArrayList<Node>();
	}

	public Node(int _val) {
		val = _val;
		neighbors = new ArrayList<Node>();
	}

	public Node(int _val, ArrayList<Node> _neighbors) {
		val = _val;
		neighbors = _neighbors;
	}

	public Node cloneGraph(Node node) {

		if (visited.containsKey(node)) {
			return visited.get(node);
		}

		Node clone = new Node(node.val, new ArrayList<>());
		visited.put(node, clone);

		for (Node n : node.neighbors) {
			clone.neighbors.add(cloneGraph(n));
		}

		return clone;

	}

	//Using BFS
	public Node cloneGraph2(Node node) {

		if (node == null)
			return node;
		// if(visited.containsKey(node)) return visited.get(node);

		LinkedList<Node> queue = new LinkedList<>();
		Node clone = new Node(node.val, new ArrayList<>());
		visited.put(node, clone);
		queue.add(node);
		while (!queue.isEmpty()) {
			Node next = queue.poll();
			Node cloneNode = null;
			for (Node n : next.neighbors) {
				if (!visited.containsKey(n)) {
					cloneNode = new Node(n.val, new ArrayList<>());
					visited.put(n, cloneNode);
					// cloneNode.neighbors.add(n);
					queue.add(n);
				}
				visited.get(next).neighbors.add(visited.get(n));
			}

		}

		return clone;
	}
	
	//Time complexity: O(M+N)
	//Space Complexity: O(M)
}
