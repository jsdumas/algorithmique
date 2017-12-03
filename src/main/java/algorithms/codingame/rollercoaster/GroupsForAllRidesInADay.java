package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GroupsForAllRidesInADay {

	private final long maxPlaceNumber;
	private final Stack<Ride> allRideGroups;

	public GroupsForAllRidesInADay(long maxPlaceNumber) {
		this.maxPlaceNumber = maxPlaceNumber;
		this.allRideGroups = new Stack<Ride>();
	}

	public long getNumber() {
		return allRideGroups.size();
	}

	public void add(GroupOfRiders group) {
		if (allRideGroups.isEmpty() || (allRideGroups.peek().getNumberOfRiders() + group.getNumberOfRiders() > this.maxPlaceNumber)) {
			Ride groupByRide = new Ride();
			groupByRide.add(group);
			allRideGroups.add(groupByRide);
		} else {
			allRideGroups.peek().add(group);
		}
	}

	public Stack<Ride> getAllRideGroups() {
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
			if (group.getNumberOfRiders() + allRideGroups.peek().getNumberOfRiders() > this.maxPlaceNumber) {
				break;
			}
			allRideGroups.peek().add(group);
		}
	}

}
