package algorithms.codingame.rollercoaster;

public class RollerCoaster {

	private final long rideCapacity;
	private final long rideNumberByDay;
	private final RollerCoasterQueue rollerCoasterWaitingQueue;

	public RollerCoaster(long placeNumber, long rideNumberByDay, RollerCoasterQueue rollerCoasterQueue) {
		this.rideCapacity = placeNumber;
		this.rideNumberByDay = rideNumberByDay;
		this.rollerCoasterWaitingQueue = rollerCoasterQueue;
	}

	public long getPlaceNumberForARide() {
		return rideCapacity;
	}

	public long getRideNumberByDay() {
		return rideNumberByDay;
	}

	public RollerCoasterQueue getWaitingQueue() {
		return rollerCoasterWaitingQueue;
	}
	
	public boolean areEnoughPlacesForNextGroup(long busyPlace){
		return busyPlace + rollerCoasterWaitingQueue.getNumberOfRidersOfNextGroup() <= rideCapacity;
	}
	
}
