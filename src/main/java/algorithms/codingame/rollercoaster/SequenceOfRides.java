package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class SequenceOfRides {

	private final Queue<GroupOfRiders> groupOfRidersQueue;

	public SequenceOfRides(Queue<GroupOfRiders> groupsOfRidersQueue) {
		this.groupOfRidersQueue = new LinkedList<GroupOfRiders>();
		this.groupOfRidersQueue.addAll(groupsOfRidersQueue);
	}

	public Queue<Ride> getSequence(long rollerCoasterCapacity) {
		GroupsForAllRidesInADay groupsForAllRidesInADay = new GroupsForAllRidesInADay(rollerCoasterCapacity);
		Queue<GroupOfRiders> nextGroupforASecondRide = new LinkedList<GroupOfRiders>();
		while (!groupOfRidersQueue.isEmpty()) {
			GroupOfRiders group = groupOfRidersQueue.poll();
			groupsForAllRidesInADay.add(group);
			nextGroupforASecondRide.add(group);
		}
		groupsForAllRidesInADay.addSecondRideGroup(nextGroupforASecondRide);
		
		Queue<Ride> ridesQueue = new LinkedList<Ride>();
		ridesQueue.addAll(groupsForAllRidesInADay.getAllRideGroups());
		return ridesQueue;
	}

}
