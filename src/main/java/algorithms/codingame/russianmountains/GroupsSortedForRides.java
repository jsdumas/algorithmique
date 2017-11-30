package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class GroupsSortedForRides {

	private final Queue<GroupOfPerson> groupQueue;
	private final GroupsForAllRidesInADay groupsForAllRidesInADay;

	public GroupsSortedForRides(RussianMountains russianMountains) {
		this.groupQueue = new LinkedList<GroupOfPerson>();
		this.groupQueue.addAll(russianMountains.getRussianMountainsQueue().getGroupOfPerson());
		this.groupsForAllRidesInADay = initAllGroupsByRide(russianMountains.getPlaceNumber());
	}

	private GroupsForAllRidesInADay initAllGroupsByRide(long placeNumber) {
		GroupsForAllRidesInADay allGroupsByRide = new GroupsForAllRidesInADay(placeNumber);
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
		return groupsForAllRidesInADay.getNumber();
	}

	public Queue<GroupsByRide> getAllGroupsByRide() {
		Queue<GroupsByRide> allRideGroups = new LinkedList<GroupsByRide>();
		allRideGroups.addAll(groupsForAllRidesInADay.getAllRideGroups());
		return allRideGroups;
	}

}
