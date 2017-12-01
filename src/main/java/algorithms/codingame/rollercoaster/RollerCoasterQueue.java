package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class RollerCoasterQueue {

	private static final long ZERO = 0;
	private final Queue<GroupOfRiders> waitingGroupsOfPersons;
	private long numberOfPerson;
	private GroupOfRiders nextGroupForARide;

	public RollerCoasterQueue() {
		this.waitingGroupsOfPersons = new LinkedList<GroupOfRiders>();
		this.numberOfPerson = ZERO;
	}

	public void addGroup(GroupOfRiders groupOfRiders) {
		this.numberOfPerson += groupOfRiders.getNumberOfRiders();
		this.waitingGroupsOfPersons.add(groupOfRiders);
	}

	public Queue<GroupOfRiders> getWaitingGroupsOfPersons() {
		return waitingGroupsOfPersons;
	}

	public long getNumberOfPerson() {
		return numberOfPerson;
	}

	public boolean canNextGroupGetIn(int currentCapacity, long placeNumberForARide) {
		return currentCapacity + waitingGroupsOfPersons.peek().getNumberOfRiders() <= placeNumberForARide;
	}

	public boolean areAllWaitingGroupsPassed() {
		GroupOfRiders nextGroupOfPerson = waitingGroupsOfPersons.peek();
		return nextGroupOfPerson.getId() == ZERO;
	}

	public long getNumberOfNextRiders() {
		nextGroupForARide = waitingGroupsOfPersons.poll();
		waitingGroupsOfPersons.add(nextGroupForARide);
		return nextGroupForARide.getNumberOfRiders();
	}

	public long getNextGroupForARideId() {
		return nextGroupForARide.getId();
	}

}
