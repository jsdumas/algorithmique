package algorithms.codingame.teads;

import java.util.ArrayList;
import java.util.List;

public class TeadsBroadcasting {

	private final List<Vertex> vertexList;
	// private final List<Vertex> vertexBroadcasted;
	private final int size;
	private int levelID;
	private final boolean changeLevel;

	public TeadsBroadcasting(int size) {
		this.size = size;
		this.vertexList = new ArrayList<Vertex>();
		this.levelID = 0;
		initVertexList();
		changeLevel = false;
		// this.vertexBroadcasted = new ArrayList<Vertex>();
		// vertexBroadcasted.add(null);
	}

	private void initVertexList() {
		vertexList.add(null);
		for (int i = 1; i <= size; i++) {
			vertexList.add(new Vertex(i));
		}
	}

	public void broadcast() {
		for (Vertex current : vertexList) {
			if (current != null) {
				current.setLevelID(0);
				levelNumberSearch(current);
				current.setBroadcastingHour(levelID);
				levelID = 0;
			}
		}
	}

	private void levelNumberSearch(Vertex current) {
		if (!current.getNeighbourList().isEmpty()) {
			levelID = current.getLevelID() + 1;
		}
		for (Vertex neighbour : current.getNeighbourList()) {
			neighbour.setLevelID(levelID);
			levelNumberSearch(neighbour);
		}
	}

	public int getSize() {
		return size;
	}

	public void addNeighbour(int idFrom, int idTo) {
		Vertex from = vertexList.get(idFrom);
		Vertex to = vertexList.get(idTo);
		from.addNeighbour(to);
		// to.addNeighbour(from);
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

}
