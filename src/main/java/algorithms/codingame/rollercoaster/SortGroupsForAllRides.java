package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class SortGroupsForAllRides {

	private RollerCoaster rollerCoaster;
	private GroupsForAllRidesInADay groupsForAllRidesInADay;

	public SortGroupsForAllRides(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
		this.groupsForAllRidesInADay = new GroupsForAllRidesInADay(rollerCoaster.getPlaceNumberForARide());
	}


	public GroupsForAllRidesInADay getGroupsForAllRidesInADay() {
		Queue<GroupOfPerson> waitingGroupForThisRide = new LinkedList<GroupOfPerson>();
		waitingGroupForThisRide.addAll(rollerCoaster.getWaitingQueue().getWaitingGroupsOfPersons());
		Queue<GroupOfPerson> waitingGroupForNextRide = new LinkedList<GroupOfPerson>();
		for(long i=0; i<rollerCoaster.getRideNumberByDay(); i++){
			if(waitingGroupForThisRide.isEmpty()){
				waitingGroupForThisRide.addAll(waitingGroupForNextRide); 
				waitingGroupForNextRide = new LinkedList<GroupOfPerson>();
			}
			GroupOfPerson nextGroupForARide = waitingGroupForThisRide.poll();
			groupsForAllRidesInADay.addGroupOfRiders(nextGroupForARide);
		}
		return groupsForAllRidesInADay;
	}

}
