package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class GroupsByRide {

	private final Queue<GroupOfRiders> groupOfRiders;
	private long personNumber;

	public GroupsByRide() {
		this.groupOfRiders = new LinkedList<GroupOfRiders>();
		this.personNumber = 0;
	}

	public GroupsByRide add(GroupOfRiders group) {
		groupOfRiders.add(group);
		personNumber += group.getNumberOfRiders();
		return null;
	}

	public long getNumberOfPassengers() {
		return personNumber;
	}

	public Queue<GroupOfRiders> getGroupOfPerson() {
		return groupOfRiders;
	}

}
