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

	public SequenceOfRides(long maxPlaceNumber) {
		this.rideCapacity = maxPlaceNumber;
		this.sequenceOfRides = new Stack<Ride>();
		this.gainOfSequence = 0;
		this.rideMap = new HashMap<Long, Ride>();
		this.numberOfRidersForASecondRide = ZERO;
		this.numberOfGroupsForASecondRide = ZERO;
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
		
		return false;//!(group.getId() >= ZERO);
	}

	public long dailyGain(long numberOfRidesByDay, RollerCoasterQueue rollerCoasterQueue) {

//		if (rideCapacity > rollerCoasterQueue.getNumberOfRiders()) {
//			return rollerCoasterQueue.getNumberOfRiders() * numberOfRidesByDay;
//		}
		
		long sequenceSize=0;
		if(sequenceOfRides.peek().getGroupOfRiders().size() == numberOfGroupsForASecondRide){
			sequenceSize = sequenceOfRides.size()-1;
		} else {
			sequenceSize = sequenceOfRides.size();
		}

		long numberOfRidesByDayDividedBySequences = numberOfRidesByDay / sequenceSize;
//		long gainOfTheDay = (gainOfSequence - numberOfRidersForASecondRide) * (numberOfRidesByDayDividedBySequences);
//		long rest = numberOfRidesByDay % sequenceSize;
//		if (rest == 0) {
//			return gainOfTheDay + numberOfRidersForASecondRide * numberOfRidesByDayDividedBySequences;
//		}

//		long count = 0;
//		for (Ride ride : sequenceOfRides) {
//			if (count == rest) {
//				break;
//			}
//			gainOfTheDay += ride.getNumberOfRiders();
//			count++;
//		}
		return ((gainOfSequence - numberOfRidersForASecondRide) * (numberOfRidesByDayDividedBySequences)) + (numberOfRidersForASecondRide * numberOfRidesByDayDividedBySequences);
	}

}
