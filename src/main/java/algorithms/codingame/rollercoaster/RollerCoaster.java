package algorithms.codingame.rollercoaster;

public class RollerCoaster {

	private final long placeNumberForARide;
	private final long rideNumberByDay;
	private final RollerCoasterQueue rollerCoasterWaitingQueue;

	public RollerCoaster(long placeNumber, long rideNumberByDay, RollerCoasterQueue rollerCoasterQueue) {
		this.placeNumberForARide = placeNumber;
		this.rideNumberByDay = rideNumberByDay;
		this.rollerCoasterWaitingQueue = rollerCoasterQueue;
	}

	public long getPlaceNumberForARide() {
		return placeNumberForARide;
	}

	public long getRideNumberByDay() {
		return rideNumberByDay;
	}

	public RollerCoasterQueue getWaitingQueue() {
		return rollerCoasterWaitingQueue;
	}
	
	public long getNumberOfRidersOfNextGroup(){
		return rollerCoasterWaitingQueue.getNumberOfRidersOfNextGroup();
	}

}
