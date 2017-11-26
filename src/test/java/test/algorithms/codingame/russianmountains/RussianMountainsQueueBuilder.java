package test.algorithms.codingame.russianmountains;

import algorithms.codingame.russianmountains.GroupOfPerson;
import algorithms.codingame.russianmountains.RussianMountainsQueue;

public class RussianMountainsQueueBuilder {

	private final RussianMountainsQueue russianMountainsQueue;
	
	public RussianMountainsQueueBuilder() {
		this.russianMountainsQueue = new RussianMountainsQueue();
	}

	public RussianMountainsQueueBuilder with(GroupOfPerson groupQueue) {
		russianMountainsQueue.addGroup(groupQueue);
		return this;
	}

	public RussianMountainsQueue build() {
		return russianMountainsQueue;
	}

}
