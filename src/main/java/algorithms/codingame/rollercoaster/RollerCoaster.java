package algorithms.codingame.rollercoaster;

import java.util.Queue;

public class RollerCoaster {

	private final long capacity;
	private final long rideNumberByDay;
	private final RollerCoasterQueue rollerCoasterQueue;

	public RollerCoaster(long placeNumber, long rideNumberByDay, RollerCoasterQueue rollerCoasterQueue) {
		this.capacity = placeNumber;
		this.rideNumberByDay = rideNumberByDay;
		this.rollerCoasterQueue = rollerCoasterQueue;
	}

	public long getPlaceNumber() {
		return capacity;
	}

	public RollerCoasterQueue getRussianMountainsQueue() {
		return rollerCoasterQueue;
	}
	
	private boolean isPlaceNumberGreaterThanRiders(){
		return capacity>rollerCoasterQueue.getNumberOfPerson();
	}


	public long dailyGain() {
		if (isPlaceNumberGreaterThanRiders()) {
			return rollerCoasterQueue.getNumberOfPerson() * rideNumberByDay;
		}
		SequenceOfRides sequenceOfRides = new SequenceOfRides(capacity, rollerCoasterQueue.getGroupsOfRiders());
		long numberOfRiders = 0;
		Queue<Ride> sequenceOfRidesQueue = sequenceOfRides.getSequence();
		for (Ride ride : sequenceOfRidesQueue) {
			numberOfRiders += ride.getNumberOfRiders();
		}
		return numberOfRiders * (rideNumberByDay / sequenceOfRidesQueue.size());
	}

}
