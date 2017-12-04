package algorithms.codingame.rollercoaster;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Ride {

	private final Queue<GroupOfRiders> groupOfRiders;
	private final HashMap<Long, GroupOfRiders> groupOfRidersMap;

	private long numberOfRiders;

	public Ride() {
		this.groupOfRiders = new LinkedList<GroupOfRiders>();
		this.groupOfRidersMap = new HashMap<Long, GroupOfRiders>();
		this.numberOfRiders = 0;
	}

	public void add(GroupOfRiders group) {
		groupOfRiders.add(group);
		groupOfRidersMap.put(group.getId(), group);
		numberOfRiders += group.getNumberOfRiders();
	}

	public long getNumberOfRiders() {
		return numberOfRiders;
	}

	public HashMap<Long, GroupOfRiders> getGroupOfRidersMap() {
		return groupOfRidersMap;
	}

	public Queue<GroupOfRiders> getGroupOfRiders() {
		return groupOfRiders;
	}

}
