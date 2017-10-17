package algorithms.codingame.teads;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private final int vertexID;
	private final List<Vertex> neighbourList;
	private boolean visited;
	private int levelID;

	private Vertex predecessor;
	private int broadcastingHour;

	public void setBroadcastingHour(int broadcastingHour) {
		this.broadcastingHour = broadcastingHour;
	}

	public Vertex(int vertexID) {
		this.vertexID = vertexID;
		this.neighbourList = new ArrayList<>();
	}

	public void addNeighbour(Vertex vertex) {
		this.neighbourList.add(vertex);
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public int getVertexID() {
		return vertexID;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public int getBroadcastingHour() {
		return broadcastingHour;
	}
	
	public int getLevelID() {
		return levelID;
	}

	public void setLevelID(int levelID) {
		this.levelID = levelID;
	}

}
