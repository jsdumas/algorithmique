package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class RollerCoasterQueue {

	private final Queue<GroupOfPerson> waitingGroupsOfPersons;
	private long numberOfPerson;

	public RollerCoasterQueue() {
		this.waitingGroupsOfPersons = new LinkedList<GroupOfPerson>();
		this.numberOfPerson = 0L;
	}

	public void addGroup(GroupOfPerson groupOfPerson) {
		this.numberOfPerson += groupOfPerson.getNumberOfPerson();
		this.waitingGroupsOfPersons.add(groupOfPerson);
	}

	public Queue<GroupOfPerson> getWaitingGroupsOfPersons() {
		return waitingGroupsOfPersons;
	}

	public long getNumberOfPerson() {
		return numberOfPerson;
	}

	public boolean canNextGroupGetIn(int currentCapacity, long placeNumberForARide) {
		return currentCapacity + waitingGroupsOfPersons.peek().getNumberOfPerson() <= placeNumberForARide;
	}

}
