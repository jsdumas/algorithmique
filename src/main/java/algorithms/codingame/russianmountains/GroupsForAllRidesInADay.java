package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GroupsForAllRidesInADay {

	private final long maxPlaceNumber;
	private final Stack<GroupsByRide> allRideGroups;

	public GroupsForAllRidesInADay(long maxPlaceNumber) {
		this.maxPlaceNumber = maxPlaceNumber;
		this.allRideGroups = new Stack<GroupsByRide>();
	}

	public long getNumber() {
		return allRideGroups.size();
	}

	public void add(GroupOfRiders group) {
		if (allRideGroups.isEmpty() || (allRideGroups.peek().getNumberOfPersons() + group.getNumberOfPerson() > this.maxPlaceNumber)) {
			GroupsByRide groupByRide = new GroupsByRide();
			groupByRide.add(group);
			allRideGroups.add(groupByRide);
		} else {
			allRideGroups.peek().add(group);
		}
	}

	public Stack<GroupsByRide> getAllRideGroups() {
		return allRideGroups;
	}

	public void addSecondRideGroup(Queue<GroupOfRiders> nextGroupforASecondRide) {
		Queue<GroupOfRiders> nextGroupDuplicated = new LinkedList<GroupOfRiders>();
		nextGroupDuplicated.addAll(nextGroupforASecondRide);
		Queue<GroupOfRiders> nextGroup = new LinkedList<GroupOfRiders>();
		while (!nextGroupforASecondRide.isEmpty()) {
			GroupOfRiders group = nextGroupforASecondRide.poll();
			nextGroup.add(group);
			if (nextGroupforASecondRide.isEmpty()) {
				nextGroupforASecondRide.addAll(nextGroup);
				nextGroup = new LinkedList<GroupOfRiders>();
			}
			if (group.getNumberOfPerson() + allRideGroups.peek().getNumberOfPersons() > this.maxPlaceNumber) {
				break;
			}
			allRideGroups.peek().add(group);
		}
	}

}
