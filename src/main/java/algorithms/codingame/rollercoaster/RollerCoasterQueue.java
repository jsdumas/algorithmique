package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class RollerCoasterQueue {

	private static final long ZERO = 0;
	private final Queue<GroupOfRiders> waitingGroupsOfRiders;
	private long numberOfPerson;
	private GroupOfRiders nextGroupForARide;

	public RollerCoasterQueue() {
		this.waitingGroupsOfRiders = new LinkedList<GroupOfRiders>();
		this.numberOfPerson = ZERO;
	}

	public void addGroup(GroupOfRiders groupOfRiders) {
		this.numberOfPerson += groupOfRiders.getNumberOfRiders();
		this.waitingGroupsOfRiders.add(groupOfRiders);
	}

	public Queue<GroupOfRiders> getWaitingGroupsOfPersons() {
		return waitingGroupsOfRiders;
	}

	public long getNumberOfPerson() {
		return numberOfPerson;
	}

	public boolean isTheNextGroupTheFirstOfNextWaitingGroups() {
		GroupOfRiders nextGroupOfRiders = waitingGroupsOfRiders.peek();
		return nextGroupOfRiders.getId() == ZERO;
	}

	public long getNumberOfNextRiders() {
		nextGroupForARide = waitingGroupsOfRiders.poll();
		waitingGroupsOfRiders.add(nextGroupForARide);
		return nextGroupForARide.getNumberOfRiders();
	}

	public boolean isTheLastGroupOnBoardTheFirstOfNextWaitingGroups() {
		return nextGroupForARide.getId() == ZERO;
	}

	public long getNumberOfRidersOfNextGroup() {
		return waitingGroupsOfRiders.peek().getNumberOfRiders();
	}

}
