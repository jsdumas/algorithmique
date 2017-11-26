package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class RussianMountainsQueue {
	
	private final Queue<GroupOfPerson> groupOfPersonQueue;
	private long numberOfPerson;
	
	public RussianMountainsQueue() {
		this.groupOfPersonQueue = new LinkedList<GroupOfPerson>();
		this.numberOfPerson=0L;
	}
	
	public void addGroup(GroupOfPerson groupOfPerson) {
		this.numberOfPerson += groupOfPerson.getNumberOfPerson();
		this.groupOfPersonQueue.add(groupOfPerson);
	}

	public Queue<GroupOfPerson> getGroupOfPerson() {
		return groupOfPersonQueue;
	}

	public long getNumberOfPerson() {
		return numberOfPerson;
	}
	
}
