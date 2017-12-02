package algorithms.codingame.rollercoaster;

import java.util.Queue;

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
	
	public boolean isPlaceNumberGreaterThanRiders(){
		return placeNumber>rollerCoasterQueue.getNumberOfPerson();
	}

	public long gainWhenPlaceAreGreaterThanRiders() {
		return rollerCoasterQueue.getNumberOfPerson() * rideNumberByDay;
	}

	public long gainWhenRidersPlaceAreGreaterThanRPlace() {
		SequenceOfRides sequenceOfRides = new SequenceOfRides(this);
		long numberOfRiders = 0;
		Queue<Ride> sequenceOfRidesQueue = sequenceOfRides.getSequence();
		for (Ride ride : sequenceOfRidesQueue) {
			numberOfRiders += ride.getNumberOfRiders();
		}
		return numberOfRiders * (rideNumberByDay / sequenceOfRidesQueue.size());
	}

}
