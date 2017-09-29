package test.algorithms.practice.graph;

import org.junit.Test;

import algorithms.practice.graph.Dijkstra;

public class DijkstraTest {

	@Test
	public void test() {
		Graph<Integer> g = new Graph<Integer>();
		// 1 -> 2 3
		// | /^ | / |
		// V / V V V
		// 4 <- 5 6)
		for (int i = 1; i <= 6; i++)
			g.addVertex(i);
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		g.addEdge(2, 5);
		g.addEdge(3, 5);
		g.addEdge(3, 6);
		g.addEdge(4, 2);
		g.addEdge(5, 4);
		g.addEdge(6, 6);

		Weight<Integer> w = new Weight<Integer>() {
			@Override
			public int weight(Integer x, Integer y) {
				if (x == 1 && y == 2)
					return 10;
				return 1;
			}
		};
		Dijkstra<Integer> dij = new Dijkstra<Integer>(g);
		dij.shortestPaths(1, w);

		for (int v : g.vertices())
			System.out.println("dist(" + v + ")=" + ((dij.distance(v) == null) ? "inf" : dij.distance(v)));
		System.out.println();
		System.out.println("TestDijkstra OK");
	}

}
