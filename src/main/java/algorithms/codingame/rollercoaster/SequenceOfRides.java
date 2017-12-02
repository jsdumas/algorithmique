package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class SequenceOfRides {

	private final Queue<GroupOfRiders> groupOfRidersQueue;
	private final GroupsForAllRidesInADay groupsForAllRidesInADay;

	public SequenceOfRides(long rollerCoasterCapacity, Queue<GroupOfRiders> groupsOfRidersQueue) {
		this.groupOfRidersQueue = new LinkedList<GroupOfRiders>();
		this.groupOfRidersQueue.addAll(groupsOfRidersQueue);
		this.groupsForAllRidesInADay = initAllGroupsByRide(rollerCoasterCapacity);
	}

	private GroupsForAllRidesInADay initAllGroupsByRide(long rollerCoasterCapacity) {
		GroupsForAllRidesInADay allGroupsByRide = new GroupsForAllRidesInADay(rollerCoasterCapacity);
		Queue<GroupOfRiders> nextGroupforASecondRide = new LinkedList<GroupOfRiders>();
		while (!groupOfRidersQueue.isEmpty()) {
			GroupOfRiders group = groupOfRidersQueue.poll();
			allGroupsByRide.add(group);
			nextGroupforASecondRide.add(group);
		}
		allGroupsByRide.addSecondRideGroup(nextGroupforASecondRide);
		return allGroupsByRide;
	}

	public long getCombinationNumber() {
		return groupsForAllRidesInADay.getNumber();
	}

	public Queue<Ride> getSequence() {
		Queue<Ride> ridesQueue = new LinkedList<Ride>();
		ridesQueue.addAll(groupsForAllRidesInADay.getAllRideGroups());
		return ridesQueue;
	}

}
