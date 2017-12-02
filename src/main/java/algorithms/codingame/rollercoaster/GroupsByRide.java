package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class GroupsByRide {

	private final Queue<GroupOfRiders> groupOfPerson;
	private long personNumber;

	public GroupsByRide() {
		this.groupOfPerson = new LinkedList<GroupOfRiders>();
		this.personNumber = 0;
	}

	public GroupsByRide add(GroupOfRiders group) {
		groupOfPerson.add(group);
		personNumber += group.getNumberOfPerson();
		return null;
	}

	public long getNumberOfRiders() {
		return personNumber;
	}

	public Queue<GroupOfRiders> getGroupOfPerson() {
		return groupOfPerson;
	}

}
