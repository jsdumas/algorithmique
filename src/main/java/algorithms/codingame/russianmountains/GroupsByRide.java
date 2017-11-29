package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class GroupsByRide {

	private final Queue<GroupOfPerson> groupOfPerson;
	private long personNumber;

	public GroupsByRide() {
		this.groupOfPerson = new LinkedList<GroupOfPerson>();
		this.personNumber = 0;
	}

	public GroupsByRide add(GroupOfPerson group) {
		groupOfPerson.add(group);
		personNumber += group.getNumberOfPerson();
		return null;
	}

	public long getNumberOfPersons() {
		return personNumber;
	}

	public Queue<GroupOfPerson> getGroupOfPerson() {
		return groupOfPerson;
	}

}
