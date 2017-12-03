package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class Ride {

	private final Queue<GroupOfRiders> groupOfRiders;
	private long numberOfRiders;


	public Ride() {
		this.groupOfRiders = new LinkedList<GroupOfRiders>();
		this.numberOfRiders = 0;
	}

	public void add(GroupOfRiders group) {
		groupOfRiders.add(group);
		numberOfRiders += group.getNumberOfRiders();
	}

	public long getNumberOfRiders() {
		return numberOfRiders;
	}
	
}
