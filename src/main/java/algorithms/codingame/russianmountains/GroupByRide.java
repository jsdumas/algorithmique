package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class GroupByRide {

	private final Queue<GroupOfPerson> groupOfPerson;
	private int personNumber;

	public GroupByRide() {
		this.groupOfPerson = new LinkedList<GroupOfPerson>();
		this.personNumber = 0;
	}

	public GroupByRide add(GroupOfPerson group) {
		groupOfPerson.add(group);
		personNumber += group.getNumberOfPerson();
		return null;
	}

	public int getPersonNumber() {
		return personNumber;
	}

	public Queue<GroupOfPerson> getGroupOfPerson() {
		return groupOfPerson;
	}

}
