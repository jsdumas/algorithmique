package algorithms.codingame.rollercoaster;

public class RollerCoaster {

	private final long placeNumber;
	private final long rideNumberByDay;
	private final RollerCoasterQueue rollerCoasterQueue;

	public RollerCoaster(long placeNumber, long rideNumberByDay, RollerCoasterQueue rollerCoasterQueue) {
		this.placeNumber = placeNumber;
		this.rideNumberByDay = rideNumberByDay;
		this.rollerCoasterQueue = rollerCoasterQueue;
	}

	public long getPlaceNumber() {
		return placeNumber;
	}

	public long getRideNumberByDay() {
		return rideNumberByDay;
	}

	public RollerCoasterQueue getRussianMountainsQueue() {
		return rollerCoasterQueue;
	}
	
	public boolean isPlaceNumberGreaterThanPeople(){
		return placeNumber>rollerCoasterQueue.getNumberOfPerson();
	}

}
