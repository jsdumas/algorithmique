package algorithms.codingame.rollercoaster;

import java.util.Deque;
import java.util.LinkedList;

public class SortGroupsForAllRides {

	private final RollerCoaster rollerCoaster;
	private final GroupsForAllRidesInADay groupsForAllRidesInADay;

	public SortGroupsForAllRides(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
		this.groupsForAllRidesInADay = new GroupsForAllRidesInADay(rollerCoaster.getPlaceNumberForARide());
	}

	public GroupsForAllRidesInADay getGroupsForAllRidesInADay() {
		Deque<GroupOfPerson> waitingGroupForThisRide = new LinkedList<GroupOfPerson>();
		waitingGroupForThisRide.addAll(rollerCoaster.getWaitingQueue().getWaitingGroupsOfPersons());
		for (long i = 0; i < rollerCoaster.getRideNumberByDay(); i++) {
			if (groupsForAllRidesInADay.isEmpty() || (groupsForAllRidesInADay.getLastPassengers() + waitingGroupForThisRide.peek()
					.getNumberOfPerson() > rollerCoaster.getPlaceNumberForARide())) {
				GroupOfPerson nextGroupForARide = waitingGroupForThisRide.poll();
				groupsForAllRidesInADay.addNewGroupOfRiders(nextGroupForARide);
				waitingGroupForThisRide.add(nextGroupForARide);
			}
			while (true) {
				if (groupsForAllRidesInADay.getLastPassengers() + waitingGroupForThisRide.peek().getNumberOfPerson() > rollerCoaster
						.getPlaceNumberForARide()) {
					break;
				}
				GroupOfPerson nextGroupForARide = waitingGroupForThisRide.poll();
				groupsForAllRidesInADay.addToCurrentGroupOfRiders(nextGroupForARide);
				waitingGroupForThisRide.add(nextGroupForARide);
			}
		}
		return groupsForAllRidesInADay;
	}

}
