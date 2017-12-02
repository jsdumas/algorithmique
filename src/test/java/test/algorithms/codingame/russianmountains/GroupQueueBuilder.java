package test.algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

import algorithms.codingame.russianmountains.GroupOfRiders;

public class GroupQueueBuilder {

	private final Queue<GroupOfRiders> groupOfPerson;

	public GroupQueueBuilder() {
		this.groupOfPerson = new LinkedList<GroupOfRiders>();
	}

	public GroupQueueBuilder with(int numberOfPerson) {
		groupOfPerson.add(new GroupOfRiders(numberOfPerson));
		return this;
	}

	public Queue<GroupOfRiders> build() {
		return groupOfPerson;
	}

}
