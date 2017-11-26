package algorithms.codingame.russianmountains;

import java.util.Queue;
import java.util.Stack;

public class GroupsByRideInADay {

	private final long maxPlaceNumber;
	private final Stack<GroupsByRide> allRideGroups;

	public GroupsByRideInADay(long maxPlaceNumber) {
		this.maxPlaceNumber = maxPlaceNumber;
		this.allRideGroups = new Stack<GroupsByRide>();
	}

	public long getNumber() {
		return allRideGroups.size();
	}

	public void add(GroupOfPerson group) {
		if (allRideGroups.isEmpty() || (allRideGroups.peek().getPersonNumber() + group.getNumberOfPerson() > this.maxPlaceNumber)) {
			GroupsByRide groupByRide = new GroupsByRide();
			groupByRide.add(group);
			allRideGroups.add(groupByRide);
		} else {
			allRideGroups.peek().add(group);
		}
	}

	public Stack<GroupsByRide> getAllRideGroups() {
		return allRideGroups;
	}

	public void addSecondRideGroup(Queue<GroupOfPerson> nextGroupforASecondRide) {
		while(!nextGroupforASecondRide.isEmpty()) {
			GroupOfPerson group = nextGroupforASecondRide.poll();
			if(group.getNumberOfPerson()+allRideGroups.peek().getPersonNumber()>this.maxPlaceNumber) {
				break;
			}
			allRideGroups.peek().add(group);
		}
	}

}
