package algorithms.codingame.teads;

import java.util.ArrayList;
import java.util.List;

public class TeadsBroadcasting {

	private final List<Vertex> vertexList;
	private final int size;
	private int levelID;
	private Vertex predecessor;
	private int vertexVisited;

	public TeadsBroadcasting(int size) {
		this.size = size;
		this.vertexList = new ArrayList<Vertex>();
		this.levelID = 0;
		initVertexList();
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
				predecessor = null;
				levelID = 0;
				vertexVisited = 0;
				levelNumberSearch(current);
				current.setBroadcastingHour(levelID);
			}
		}
	}

	private void levelNumberSearch(Vertex current) {
		for (Vertex neighbour : current.getNeighbourList()) {
			neighbour.setPredecessor(current);
			levelID = current.getLevelID() + 1;
			neighbour.setLevelID(levelID);
			if (neighbour != current.getPredecessor()) {
				levelNumberSearch(neighbour);
			}
		}
	}

	public int getSize() {
		return size;
	}

	public void addNeighbour(int idFrom, int idTo) {
		Vertex from = vertexList.get(idFrom);
		Vertex to = vertexList.get(idTo);
		from.addNeighbour(to);
		to.addNeighbour(from);
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public int getShortestHourNumber() {
		int hourNumber = Integer.MAX_VALUE;
		for (Vertex current : vertexList) {
			if (current != null && current.getBroadcastingHour() < hourNumber) {
				hourNumber = current.getBroadcastingHour();
			}
		}
		return hourNumber;
	}

}
