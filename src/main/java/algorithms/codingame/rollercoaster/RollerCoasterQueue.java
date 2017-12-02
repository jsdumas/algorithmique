package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class RollerCoasterQueue {
	
	private final Queue<GroupOfRiders> groupOfPersonQueue;
	private long numberOfPerson;
	
	public RollerCoasterQueue() {
		this.groupOfPersonQueue = new LinkedList<GroupOfRiders>();
		this.numberOfPerson=0L;
	}
	
	public void addGroup(GroupOfRiders groupOfPerson) {
		this.numberOfPerson += groupOfPerson.getNumberOfPerson();
		this.groupOfPersonQueue.add(groupOfPerson);
	}

	public Queue<GroupOfRiders> getGroupOfPerson() {
		return groupOfPersonQueue;
	}

	public long getNumberOfPerson() {
		return numberOfPerson;
	}
	
}
