package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class GroupsSortedForRides {

	private final Queue<GroupOfPerson> groupQueue;
	private final AllGroupsByRide allGroupsByRide;

	public GroupsSortedForRides(RussianMountains russianMountains) {
		this.groupQueue = new LinkedList<GroupOfPerson>();
		this.groupQueue.addAll(russianMountains.getRussianMountainsQueue().getGroupOfPerson());
		this.allGroupsByRide = initAllGroupsByRide(russianMountains.getPlaceNumber());
	}

	private AllGroupsByRide initAllGroupsByRide(long placeNumber) {
		AllGroupsByRide allGroupsByRide = new AllGroupsByRide(placeNumber);
		Queue<GroupOfPerson> nextGroupforASecondRide = new LinkedList<GroupOfPerson>();
		while (!groupQueue.isEmpty()) {
			GroupOfPerson group = groupQueue.poll();
			allGroupsByRide.add(group);
			nextGroupforASecondRide.add(group);
		}
		allGroupsByRide.addSecondRideGroup(nextGroupforASecondRide);
		return allGroupsByRide;
	}

	public long getCombinationNumber() {
		return allGroupsByRide.getNumber();
	}

	public Queue<GroupsByRide> getAllGroupsByRide() {
		Queue<GroupsByRide> allRideGroups = new LinkedList<GroupsByRide>();
		allRideGroups.addAll(allGroupsByRide.getAllRideGroups());
		return allRideGroups;
	}

}
