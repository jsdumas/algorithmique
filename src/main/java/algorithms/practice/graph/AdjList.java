package algorithms.practice.graph;

// graphes par listes d'adjacence

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class AdjList<V> {

	private final Map<V, LinkedList<V>> adj;

	public AdjList() {
		this.adj = new HashMap<V, LinkedList<V>>();
	}

	public void addVertex(V u) {
		List<V> s = this.adj.get(u);
		if (s == null)
			this.adj.put(u, new LinkedList<V>());
	}

	public boolean hasEdge(V x, V y) {
		List<V> s = this.adj.get(x);
		return s != null && s.contains(y);
	}

	public void addEdge(V x, V y) {
		addVertex(x);
		this.adj.get(x).add(y);
	}

	public void removeEdge(V x, V y) {
		List<V> s = this.adj.get(x);
		if (s != null)
			s.remove(y);
	}

	List<V> successors(V u) {
		return this.adj.get(u);
	}

	public Set<V> vertices() {
		return this.adj.keySet();
	}

}

