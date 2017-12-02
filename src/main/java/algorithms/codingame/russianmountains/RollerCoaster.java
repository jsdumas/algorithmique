package algorithms.codingame.russianmountains;

public class RollerCoaster {

	private final long placeNumber;
	private final long rideNumberByDay;
	private final RollerCoasterQueue russianMountainsQueue;

	public RollerCoaster(long placeNumber, long rideNumberByDay, RollerCoasterQueue russianMountainsQueue) {
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

	public RollerCoasterQueue getRussianMountainsQueue() {
		return russianMountainsQueue;
	}
	
	public boolean isPlaceNumberGreaterThanPeople(){
		return placeNumber>russianMountainsQueue.getNumberOfPerson();
	}

}
