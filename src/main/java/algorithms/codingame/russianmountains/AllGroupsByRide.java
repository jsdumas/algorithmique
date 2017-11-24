package algorithms.codingame.russianmountains;

import java.util.Stack;

public class AllGroupsByRide {

	private final long maxPlaceNumber;
	private final Stack<GroupByRide> allRideGroups;
	private boolean isDefined;

	public AllGroupsByRide(long maxPlaceNumber) {
		this.maxPlaceNumber = maxPlaceNumber;
		this.allRideGroups = new Stack<GroupByRide>();
		this.isDefined = false;
	}

	public boolean getIsDefined() {
		return isDefined;
	}

	public void setIsDefined(boolean isDefined) {
		this.isDefined = isDefined;
	}

	public long getNumber() {
		return allRideGroups.size();
	}

	public void add(GroupOfPerson group) {
		if (allRideGroups.isEmpty() || (allRideGroups.peek().getPersonNumber() + group.getNumberOfPerson() > this.maxPlaceNumber)) {
			GroupByRide groupByRide = new GroupByRide();
			groupByRide.add(group);
			allRideGroups.add(groupByRide);
		} else {
			allRideGroups.peek().add(group);
		}
	}

	public Stack<GroupByRide> getAllRideGroups() {
		return allRideGroups;
	}

}
