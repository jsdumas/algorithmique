package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class RollerCoasterQueue {
	
	private final Queue<GroupOfRiders> waitingGroupsOfRiders;
	private long numberOfRiders;
	
	public RollerCoasterQueue() {
		this.waitingGroupsOfRiders = new LinkedList<GroupOfRiders>();
		this.numberOfRiders=0L;
	}
	
	public void addGroup(GroupOfRiders groupOfRiders) {
		this.numberOfRiders += groupOfRiders.getNumberOfRiders();
		this.waitingGroupsOfRiders.add(groupOfRiders);
	}

	public Queue<GroupOfRiders> getGroupsOfRiders() {
		return waitingGroupsOfRiders;
	}

	public long getNumberOfRiders() {
		return numberOfRiders;
	}
	
}
