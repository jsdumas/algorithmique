package algorithms.codingame.russianmountains;

import java.util.Queue;

public class RussianMountains {

	private final int placeNumber;
	private final int rideNumberByDay;
	private Queue<GroupOfPerson> groupOfPerson;

	public RussianMountains(int placeNumber, int rideNumberByDay) {
		this.placeNumber = placeNumber;
		this.rideNumberByDay = rideNumberByDay;
	}

	public int getPlaceNumber() {
		return placeNumber;
	}

	public int getRideNumberByDay() {
		return rideNumberByDay;
	}

	public void setGroupOfPerson(Queue<GroupOfPerson> groupOfPerson) {
		this.groupOfPerson = groupOfPerson;
	}

	public Queue<GroupOfPerson> getGroupOfPerson() {
		return groupOfPerson;
	}

}
