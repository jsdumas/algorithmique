package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

/** @link DaylyRidesTest **/
public class DaylyRides {

	private final RollerCoasterQueue rollerCoasterQueue;
	private final RollerCoaster rollerCoaster;
	private final RidesCombination ridesCombination;

	public DaylyRides(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
		this.rollerCoasterQueue = rollerCoaster.getRollerCoasterQueue();
		this.ridesCombination = new RidesCombination();
	}

	// private SequenceOfRides sortSequences() {
	//
	// SequenceOfRides sequenceOfRides = new SequenceOfRides(rollerCoaster.getCapacity());
	// Queue<GroupOfRiders> currentRide = new LinkedList<GroupOfRiders>();
	//
	// return sequenceOfRides;
	// }

	public long getGain() {
		// SequenceOfRides sequenceOfRides = sortSequences();
		// return sequenceOfRides.dailyGain(rollerCoaster.getNumberOfRidesByDay(), rollerCoasterQueue);
		Queue<GroupOfRiders> waitingGroupsOfRidersQueue = new LinkedList<GroupOfRiders>();
		waitingGroupsOfRidersQueue.addAll(rollerCoasterQueue.getGroupsOfRiders());
		RidesPossible ridesPossible = ridesCombination.getRidesPossible(rollerCoaster.getCapacity(), waitingGroupsOfRidersQueue);
		long gain = 0;
		int idRide = 0;
		long countRide = 0;
		while (countRide != rollerCoaster.getNumberOfRidesByDay()) {
			if (idRide > ridesPossible.getNumberOfRides() - 1) {
				idRide = 0;
			}
			Ride ride = ridesPossible.getRide(idRide);
			gain += ride.getNumberOfRiders();
			idRide += ride.getNumberOfGroups();
			countRide++;
		}
		return gain;
	}

}
