package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GroupsForRideSerial {

	private final Stack<GroupsByRide> groupsForRideSerial;
	private long numberOfPassengersInADay;

	public GroupsForRideSerial(long maxPlaceNumber) {
		this.groupsForRideSerial = new Stack<GroupsByRide>();
		this.numberOfPassengersInADay = 0;
	}

	public long getNumberOfGroups() {
		return groupsForRideSerial.size();
	}

	public long getAllpassengers() {
		return numberOfPassengersInADay;
	}

	public boolean isEmpty() {
		return groupsForRideSerial.isEmpty();
	}

	public void addNewGroupOfRiders(GroupOfRiders nextGroupForARide) {
		numberOfPassengersInADay += nextGroupForARide.getNumberOfRiders();
		GroupsByRide groupByRide = new GroupsByRide();
		groupByRide.add(nextGroupForARide);
		groupsForRideSerial.add(groupByRide);
	}

	public long getLastPassengers() {
		return groupsForRideSerial.peek().getNumberOfPassengers();
	}

	public void addToCurrentGroupOfRiders(GroupOfRiders nextGroupForARide) {
		numberOfPassengersInADay += nextGroupForARide.getNumberOfRiders();
		GroupsByRide currentGroupsByRide = groupsForRideSerial.pop();
		currentGroupsByRide.add(nextGroupForARide);
		groupsForRideSerial.add(currentGroupsByRide);
	}

	public Queue<GroupsByRide> getGroupsForRideSerial() {
		Queue<GroupsByRide> groupsForRideSerial = new LinkedList<GroupsByRide>();
		groupsForRideSerial.addAll(this.groupsForRideSerial);
		return groupsForRideSerial;
	}

}
