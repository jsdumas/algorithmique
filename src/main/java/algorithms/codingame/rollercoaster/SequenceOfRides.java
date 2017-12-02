package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class SequenceOfRides {

	private final Queue<GroupOfRiders> groupOfRidersQueue;
	private final GroupsForAllRidesInADay groupsForAllRidesInADay;

	public SequenceOfRides(RollerCoaster rollerCoaster) {
		this.groupOfRidersQueue = new LinkedList<GroupOfRiders>();
		this.groupOfRidersQueue.addAll(rollerCoaster.getRussianMountainsQueue().getGroupOfPerson());
		this.groupsForAllRidesInADay = initAllGroupsByRide(rollerCoaster.getPlaceNumber());
	}

	private GroupsForAllRidesInADay initAllGroupsByRide(long placeNumber) {
		GroupsForAllRidesInADay allGroupsByRide = new GroupsForAllRidesInADay(placeNumber);
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
