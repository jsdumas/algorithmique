package test.algorithmes.graph;

import algorithmes.graph.AdjList;

public class AdjListTest {

	public static void main(String[] args) {
		AdjList<Integer> g = new AdjList<Integer>();
		g.addVertex(1);
		g.addVertex(3);
		g.addVertex(5);
		g.addEdge(1, 3);
		g.addEdge(3, 5);
		assert (g.hasEdge(1, 3));
		g.removeEdge(1, 3);
		assert (!g.hasEdge(1, 3));
		assert (!g.hasEdge(3, 1));
		assert (g.hasEdge(3, 5));

		g.addEdge(1, 3);
		g.addEdge(5, 3);

		// DFS
		DFSAdjList<Integer> dfs = new DFSAdjList<Integer>(g);
		dfs.dfs(3);
		for (int v : g.vertices())
			System.out.println("dfs(" + v + ")=" + dfs.dfsNum(v));
		System.out.println();

		// BFS
		BFSAdjList<Integer> bfs = new BFSAdjList<Integer>(g);
		bfs.bfs();
		for (int v : g.vertices())
			System.out.println("bfs(" + v + ")=" + bfs.bfsNum(v));

		System.out.println("TestAdjList OK");
	}

}
