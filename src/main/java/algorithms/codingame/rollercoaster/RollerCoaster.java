package algorithms.codingame.rollercoaster;

public class RollerCoaster {

	private final long capacity;
	private final long numberOfRidesByDay;
	private final RollerCoasterQueue rollerCoasterQueue;

	public RollerCoaster(long placeNumber, long numberOfRidesByDay, RollerCoasterQueue rollerCoasterQueue) {
		this.capacity = placeNumber;
		this.numberOfRidesByDay = numberOfRidesByDay;
		this.rollerCoasterQueue = rollerCoasterQueue;
	}

	public long dailyGain() {
		SortSequenceOfRides sortSequenceOfRides = new SortSequenceOfRides(rollerCoasterQueue.getGroupsOfRiders());
		SequenceOfRides sequenceOfRides = sortSequenceOfRides.getSequence(capacity, numberOfRidesByDay);
		return sequenceOfRides.dailyGain(numberOfRidesByDay); 
		
	}

}
