package algorithms.codingame.rollercoaster;

import java.util.Stack;

public class GroupsForAllRidesInADay {

	private final long maxPlaceNumber;
	private final Stack<GroupsByRide> allRideGroups;
	private long numberOfPassengersInADay;

	public GroupsForAllRidesInADay(long maxPlaceNumber) {
		this.maxPlaceNumber = maxPlaceNumber;
		this.allRideGroups = new Stack<GroupsByRide>();
		this.numberOfPassengersInADay = 0;
	}

	public long getNumber() {
		return allRideGroups.size();
	}

	public void addGroupOfRiders(GroupOfPerson group) {
		if (allRideGroups.isEmpty() || (allRideGroups.peek().getNumberOfPersons() + group.getNumberOfPerson() > this.maxPlaceNumber)) {
			GroupsByRide groupByRide = new GroupsByRide();
			groupByRide.add(group);
			allRideGroups.add(groupByRide);
		} else {
			allRideGroups.peek().add(group);
		}
		numberOfPassengersInADay += group.getNumberOfPerson();
	}

	public long getAllpassengersInADay() {
		return numberOfPassengersInADay;
	}

	public boolean isEmpty() {
		return allRideGroups.isEmpty();
	}

	public void addNewGroupOfRiders(GroupOfPerson nextGroupForARide) {
		numberOfPassengersInADay += nextGroupForARide.getNumberOfPerson();
		GroupsByRide groupByRide = new GroupsByRide();
		groupByRide.add(nextGroupForARide);
		allRideGroups.add(groupByRide);
	}

	public long getLastPassengers() {
		return allRideGroups.peek().getNumberOfPersons();
	}

	public void addToCurrentGroupOfRiders(GroupOfPerson nextGroupForARide) {
		numberOfPassengersInADay += nextGroupForARide.getNumberOfPerson();
		allRideGroups.peek().add(nextGroupForARide);
	}

}
