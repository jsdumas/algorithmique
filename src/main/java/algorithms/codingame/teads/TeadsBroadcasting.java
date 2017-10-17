package algorithms.codingame.teads;

import java.util.ArrayList;
import java.util.List;

public class TeadsBroadcasting {

	private final List<Vertex> vertexList;
	private final int size;
	private int levelID;
	

	// private final int[][] memoizeTable;
	// private final int broadcastingHour = 0;

	public TeadsBroadcasting(int size) {
		this.size = size;
		this.vertexList = new ArrayList<Vertex>();
		initVertexList();
		// this.memoizeTable = new int[size][size];
	}

	private void initVertexList() {
		vertexList.add(null);
		for (int i = 1; i <= size; i++) {
			vertexList.add(new Vertex(i));
		}
	}

	public void broadcast() {
		for (Vertex current : vertexList) {
			if (current != null){
				levelNumberSearch(current.getNeighbourList(), 1);
				current.setBroadcastingHour(levelID);
				levelID=0;
			}
		}
	}

	private void levelNumberSearch(List<Vertex> vertexList, int vertexNumber) {
		if(vertexNumber==size){
			return;
		}
		vertexNumber += vertexList.size();
		levelID++;
		for (Vertex neighbour : vertexList) {
			neighbour.setLevelID(levelID);
			levelNumberSearch(neighbour.getNeighbourList(), vertexNumber);
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

	// public int[][] getMemoizeTable() {
	// return memoizeTable;
	// }
	//
	// public int getBroadcastingHour(int vertexID) {
	// int maxHour = Integer.MIN_VALUE;
	// int[] hours = memoizeTable[vertexID];
	// for (int i = 0; i < hours.length; i++) {
	// if (hours[i] > maxHour) {
	// maxHour = hours[i];
	// }
	// }
	// return maxHour;
	// }
}
