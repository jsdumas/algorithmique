package test.algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

import algorithms.codingame.russianmountains.GroupOfPerson;

public class GroupQueueBuilder {

	private final Queue<GroupOfPerson> groupOfPerson;

	public GroupQueueBuilder() {
		this.groupOfPerson = new LinkedList<GroupOfPerson>();
	}

	public GroupQueueBuilder with(int numberOfPerson) {
		groupOfPerson.add(new GroupOfPerson(numberOfPerson));
		return this;
	}

	public Queue<GroupOfPerson> build() {
		return groupOfPerson;
	}

}
