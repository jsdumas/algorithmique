package algorithms.codingame.russianmountains;

public class RussianMountains {

	private final long placeNumber;
	private final long rideNumberByDay;
	private final RussianMountainsQueue russianMountainsQueue;

	public RussianMountains(long placeNumber, long rideNumberByDay, RussianMountainsQueue russianMountainsQueue) {
		this.placeNumber = placeNumber;
		this.rideNumberByDay = rideNumberByDay;
		this.russianMountainsQueue = russianMountainsQueue;
	}

	public long getPlaceNumber() {
		return placeNumber;
	}

	public long getRideNumberByDay() {
		return rideNumberByDay;
	}

	public RussianMountainsQueue getRussianMountainsQueue() {
		return russianMountainsQueue;
	}
	
	public boolean isPlaceNumberGreaterThanPeople(){
		return placeNumber>russianMountainsQueue.getNumberOfPerson();
	}

}
