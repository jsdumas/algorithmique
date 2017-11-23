package test.algorithms.codingame.russianmountains;

import java.util.Queue;

import algorithms.codingame.russianmountains.GroupOfPerson;
import algorithms.codingame.russianmountains.RussianMountains;

public class RussianMountainsBuilder {

	private final RussianMountains russianMountains;

	public RussianMountainsBuilder(int placeNumber, int rideNumberByDay) {
		this.russianMountains = new RussianMountains(placeNumber, rideNumberByDay);
	}

	public RussianMountainsBuilder with(Queue<GroupOfPerson> groupQueue) {
		russianMountains.setGroupOfPerson(groupQueue);
		return this;
	}

	public RussianMountains build() {
		return russianMountains;
	}

}
