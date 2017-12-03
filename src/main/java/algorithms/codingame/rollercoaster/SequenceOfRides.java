package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class SequenceOfRides {

	private final Queue<GroupOfRiders> initialGroupsOfRidersQueue;

	public SequenceOfRides(Queue<GroupOfRiders> groupsOfRidersQueue) {
		this.initialGroupsOfRidersQueue = new LinkedList<GroupOfRiders>();
		this.initialGroupsOfRidersQueue.addAll(groupsOfRidersQueue);
	}

	public Queue<Ride> getSequence(long rollerCoasterCapacity) {
		GroupsForAllRidesInADay groupsForAllRidesInADay = new GroupsForAllRidesInADay(rollerCoasterCapacity);
		Queue<GroupOfRiders> nextGroupforASecondRide = new LinkedList<GroupOfRiders>();
		while (!initialGroupsOfRidersQueue.isEmpty()) {
			GroupOfRiders group = initialGroupsOfRidersQueue.poll();
			groupsForAllRidesInADay.add(group);
			nextGroupforASecondRide.add(group);
		}
		groupsForAllRidesInADay.addSecondRideGroup(nextGroupforASecondRide);
		Queue<Ride> ridesQueue = new LinkedList<Ride>();
		ridesQueue.addAll(groupsForAllRidesInADay.getAllRideGroups());
		return ridesQueue;
	}

}
