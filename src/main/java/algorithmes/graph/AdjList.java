package algorithme.graph;

// graphes par listes d'adjacence

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AdjList<V> {

	private final Map<V, LinkedList<V>> adj;

	AdjList() {
		this.adj = new HashMap<V, LinkedList<V>>();
	}

	void addVertex(V u) {
		List<V> s = this.adj.get(u);
		if (s == null)
			this.adj.put(u, new LinkedList<V>());
	}

	boolean hasEdge(V x, V y) {
		List<V> s = this.adj.get(x);
		return s != null && s.contains(y);
	}

	void addEdge(V x, V y) {
		addVertex(x);
		this.adj.get(x).add(y);
	}

	void removeEdge(V x, V y) {
		List<V> s = this.adj.get(x);
		if (s != null)
			s.remove(y);
	}

	List<V> successors(V u) {
		return this.adj.get(u);
	}

	Set<V> vertices() {
		return this.adj.keySet();
	}

}

class DFSAdjList<V> {

	private final AdjList<V> g;
	private final HashMap<V, Integer> visited;
	private int count;

	DFSAdjList(AdjList<V> g) {
		this.g = g;
		this.visited = new HashMap<V, Integer>();
		this.count = 0;
	}

	void dfs(V v) {
		if (this.visited.containsKey(v))
			return;
		this.visited.put(v, count++);
		for (V w : g.successors(v))
			dfs(w);
	}

	void dfs() {
		for (V v : g.vertices())
			dfs(v);
	}

	int dfsNum(V v) {
		dfs(v);
		return this.visited.get(v);
	}

}

class BFSAdjList<V> {

	private final AdjList<V> g;
	private final HashMap<V, Integer> visited;
	private int count;

	BFSAdjList(AdjList<V> g) {
		this.g = g;
		this.visited = new HashMap<V, Integer>();
		this.count = 0;
	}

	void bfs(V v) {
		Queue<V> q = new LinkedList<V>();
		if (!this.visited.containsKey(v))
			q.add(v);
		while (!q.isEmpty()) {
			v = q.poll();
			this.visited.put(v, count++);
			for (V w : g.successors(v))
				if (!this.visited.containsKey(w))
					q.add(w);
		}
	}

	void bfs() {
		for (V v : g.vertices())
			bfs(v);
	}

	int bfsNum(V v) {
		bfs(v);
		return this.visited.get(v);
	}

}
