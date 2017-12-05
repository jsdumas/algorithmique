package algorithms.codingame.rollercoaster;

import java.util.HashMap;
import java.util.Stack;

public class SequenceOfRides {

	private static final long ZERO = 0;
	private final long rideCapacity;
	private final Stack<Ride> sequenceOfRides;
	private final HashMap<Long, Ride> rideMap;
	private long gainOfSequence;
	private long currentSequenceId;
	private long numberOfRidersForASecondRide;
	private long numberOfGroupsForASecondRide;
	private long numberOfGroups;

	public SequenceOfRides(long maxPlaceNumber) {
		this.rideCapacity = maxPlaceNumber;
		this.sequenceOfRides = new Stack<Ride>();
		this.gainOfSequence = 0;
		this.rideMap = new HashMap<Long, Ride>();
		this.numberOfRidersForASecondRide = ZERO;
		this.numberOfGroupsForASecondRide = ZERO;
		this.numberOfGroups = ZERO;
	}

	public boolean canGroupGetOnBoardNow(GroupOfRiders group) {
		return sequenceOfRides.peek().getNumberOfRiders() + group.getNumberOfRiders() <= this.rideCapacity;
	}

	public void add(GroupOfRiders group) {
		if (sequenceOfRides.isEmpty() || !canGroupGetOnBoardNow(group)) {
			Ride ride = new Ride();
			ride.add(group);
			sequenceOfRides.add(ride);
			rideMap.put(group.getId(), ride);
			currentSequenceId = group.getId();
		} else {
			sequenceOfRides.peek().add(group);
		}
		gainOfSequence += group.getNumberOfRiders();
		numberOfGroups++;
	}

	public boolean isSequenceFinished(GroupOfRiders group) {
		// First ride
		if (sequenceOfRides.isEmpty()) {
			return false;
		}
		// All riders get in the same Ride
		if (currentSequenceId == ZERO && group.getId() == ZERO) {
			return true;
		}
		boolean canGroupGetOnBoardNow = canGroupGetOnBoardNow(group);
		// First group rides again but can't
		if (currentSequenceId != ZERO && group.getId() == ZERO && !canGroupGetOnBoardNow) {
			return true;
		}
		Ride ride = rideMap.get(currentSequenceId);
		// When a second ride possible
		if (currentSequenceId != ZERO && (ride.getGroupOfRidersMap().containsKey(ZERO) || group.getId() == ZERO)) {
			if (canGroupGetOnBoardNow) {
				numberOfRidersForASecondRide += group.getNumberOfRiders();
				numberOfGroupsForASecondRide++;
				return false;
			}
			return true;
		}

		return false;
	}

	public long dailyGain(long numberOfRidesByDay, RollerCoasterQueue rollerCoasterQueue) {

		long nb = numberOfGroups;
		long numberOfRidesByDayDividedBySequences = numberOfRidesByDay / sequenceOfRides.size();
		return (gainOfSequence - numberOfRidersForASecondRide) * (numberOfRidesByDayDividedBySequences) //
				+ (numberOfRidersForASecondRide * numberOfRidesByDayDividedBySequences);
	}

}
