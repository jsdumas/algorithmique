package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class GroupByRide {

	private final Queue<GroupOfPerson> groupOfPerson;
	private long personNumber;

	public GroupByRide() {
		this.groupOfPerson = new LinkedList<GroupOfPerson>();
		this.personNumber = 0;
	}

	public GroupByRide add(GroupOfPerson group) {
		personNumber += group.getNumberOfPerson();
		return null;
	}

	public long getPersonNumber() {
		return personNumber;
	}

	public Queue<GroupOfPerson> getGroupOfPerson() {
		return groupOfPerson;
	}

}
