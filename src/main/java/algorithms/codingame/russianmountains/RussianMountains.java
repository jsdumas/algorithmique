package algorithms.codingame.russianmountains;

public class RussianMountains {

	private final int placeNumber;
	private final int rideNumberByDay;
	private final RussianMountainsQueue russianMountainsQueue;

	public RussianMountains(int placeNumber, int rideNumberByDay, RussianMountainsQueue russianMountainsQueue) {
		this.placeNumber = placeNumber;
		this.rideNumberByDay = rideNumberByDay;
		this.russianMountainsQueue = russianMountainsQueue;
	}

	public int getPlaceNumber() {
		return placeNumber;
	}

	public int getRideNumberByDay() {
		return rideNumberByDay;
	}

	public RussianMountainsQueue getRussianMountainsQueue() {
		return russianMountainsQueue;
	}
	
	public boolean isPlaceNumberGreaterThanPeople(){
		return placeNumber>russianMountainsQueue.getNumberOfPerson();
	}

}
