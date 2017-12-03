package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class RollerCoasterQueue {
	
	private final Queue<GroupOfRiders> waitingGroupsOfRiders;
	public RollerCoasterQueue() {
		this.waitingGroupsOfRiders = new LinkedList<GroupOfRiders>();
	}
	
	public void addGroup(GroupOfRiders groupOfRiders) {
		groupOfRiders.getNumberOfRiders();
		this.waitingGroupsOfRiders.add(groupOfRiders);
	}

	public Queue<GroupOfRiders> getGroupsOfRiders() {
		return waitingGroupsOfRiders;
	}

}
