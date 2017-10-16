package algorithms.codingame.teads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TeadsBroadcasting_old {

	private final int size;
	private final boolean[][] matrix;
	List<Integer> verticesWithOneEdge;
	List<Integer> verticesWithSeveralEdges;

	private final Map<Integer, Integer> memoizeTable;

	private int hours;

	public TeadsBroadcasting_old(int size) {
		this.size = size;
		this.matrix = new boolean[size][size];
		this.memoizeTable = new HashMap<>();
	}

	public void addEdge(Integer x, Integer y) {
		if (x != y) {
			Integer xValue = memoizeTable.get(x);
			Integer yValue = memoizeTable.get(y);
			countEdges(x, xValue);
			countEdges(y, yValue);
		}
		this.matrix[x][y] = true;
		this.matrix[y][x] = true; // pour un graphe non orienté
	}

	private void countEdges(Integer vertex, Integer value) {
		if (value != null) {
			Integer newValue = value + 1;
			memoizeTable.put(vertex, newValue);
		} else {
			memoizeTable.put(vertex, 1);
		}
	}

	public int getBroadcastHour() {
		return 0;
	}

	public Map<Integer, Integer> getMemoizeTable() {
		return this.memoizeTable;
	}

	public List<Integer> verticesSorting() {
		this.verticesWithOneEdge = new ArrayList<Integer>();
		this.verticesWithSeveralEdges = new ArrayList<Integer>();
		Set set = memoizeTable.entrySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			if (entry.getValue().equals(1)) {
				verticesWithOneEdge.add((Integer) entry.getKey());
			} else {
				verticesWithSeveralEdges.add((Integer) entry.getKey());
			}
		}
		return verticesWithOneEdge;
	}

	public List<Integer> getVerticesWithOneEdge() {
		verticesSorting();
		return this.verticesWithOneEdge;
	}

	public List<Integer> getVerticesWithSeveralEdges() {
		verticesSorting();
		return this.verticesWithSeveralEdges;
	}

}
