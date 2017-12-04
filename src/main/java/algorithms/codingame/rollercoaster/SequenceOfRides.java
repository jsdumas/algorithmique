package algorithms.codingame.rollercoaster;

import java.util.Deque;
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

	public SequenceOfRides(long maxPlaceNumber) {
		this.rideCapacity = maxPlaceNumber;
		this.sequenceOfRides = new Stack<Ride>();
		this.gainOfSequence = 0;
		this.rideMap = new HashMap<Long, Ride>();
		this.numberOfRidersForASecondRide = ZERO;
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
	}

	public boolean isSequenceFinished(GroupOfRiders group) {
		// First ride
		if (sequenceOfRides.isEmpty()) {
			return false;
		}
		// All riders get in the same Ride
		if (sequenceOfRides.size() == 1 && group.getId() == ZERO) {
			return true;
		}
		boolean canGroupGetOnBoardNow = canGroupGetOnBoardNow(group);
		// The first group rides again but can't
		if (sequenceOfRides.size() > 1 && group.getId() == ZERO && !canGroupGetOnBoardNow) {
			return true;
		}
		Ride ride = rideMap.get(currentSequenceId);
		// is a second ride possible
		if ((ride.getGroupOfRidersMap().containsKey(ZERO) || group.getId() == ZERO) && currentSequenceId != ZERO) {
			if (canGroupGetOnBoardNow) {
				numberOfRidersForASecondRide += group.getNumberOfRiders();
				return false;
			}
			return true;
		}

		// if (group.getId() >= ZERO && currentSequenceId != ZERO) {
		// return !canGroupGetOnBoardNow;
		// }

		return !(group.getId() > ZERO);
	}

	public long dailyGain(long numberOfRidesByDay, RollerCoasterQueue rollerCoasterQueue) {

		if (rideCapacity > rollerCoasterQueue.getNumberOfRiders()) {
			return rollerCoasterQueue.getNumberOfRiders() * numberOfRidesByDay;
		}

		long gainOfTheDay = gainOfSequence * (numberOfRidesByDay / sequenceOfRides.size());
		long rest = numberOfRidesByDay % sequenceOfRides.size();
		if (rest == 0) {
			return gainOfTheDay;
		}

		long count = 0;
		for (Ride ride : sequenceOfRides) {
			if (count == rest) {
				break;
			}
			gainOfTheDay += ride.getNumberOfRiders();
			count++;
		}
		return gainOfTheDay;
	}

}
