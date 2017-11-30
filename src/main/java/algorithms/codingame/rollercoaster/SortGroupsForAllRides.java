package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class SortGroupsForAllRides {

	private final Queue<GroupOfPerson> rollerCoasterWaitingQueue;
	private final long placeNumber;

	public SortGroupsForAllRides(RollerCoaster rollerCoaster) {
		this.rollerCoasterWaitingQueue = new LinkedList<GroupOfPerson>();
		this.rollerCoasterWaitingQueue.addAll(rollerCoaster.getWaitingQueue().getGroupOfPerson());
		this.placeNumber = rollerCoaster.getPlaceNumberForARide();
	}

	public GroupsForAllRidesInADay getGroupsForAllRidesInADay() {
		GroupsForAllRidesInADay allGroupsByRide = new GroupsForAllRidesInADay(placeNumber);
		Queue<GroupOfPerson> nextGroupforASecondRide = new LinkedList<GroupOfPerson>();
		while (!rollerCoasterWaitingQueue.isEmpty()) {
			GroupOfPerson group = rollerCoasterWaitingQueue.poll();
			allGroupsByRide.add(group);
			nextGroupforASecondRide.add(group);
		}
		allGroupsByRide.addSecondRideGroup(nextGroupforASecondRide);
		return allGroupsByRide;
	}

}
