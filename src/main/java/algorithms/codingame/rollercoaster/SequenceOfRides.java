package algorithms.codingame.rollercoaster;

public class SequenceOfRides {

	// private static final long ZERO = 0;
	// private final long rideCapacity;
	// private final Stack<Ride> sequenceOfRides;
	// // private final HashMap<Long, Ride> rideMap;
	// private long gainOfSequence;
	// private long currentSequenceId;
	// private long numberOfRidersForASecondRide;
	// private long numberOfGroupsForASecondRide;
	// private long numberOfGroups;
	//
	// public SequenceOfRides(long maxPlaceNumber) {
	// this.rideCapacity = maxPlaceNumber;
	// this.sequenceOfRides = new Stack<Ride>();
	// this.gainOfSequence = 0;
	// // this.rideMap = new HashMap<Long, Ride>();
	// this.numberOfRidersForASecondRide = ZERO;
	// this.numberOfGroupsForASecondRide = ZERO;
	// this.numberOfGroups = ZERO;
	// }
	//
	// public boolean canGroupGetOnBoardNow(GroupOfRiders group) {
	// return sequenceOfRides.peek().getNumberOfRiders() + group.getNumberOfRiders() <= this.rideCapacity;
	// }
	//
	// public void add(GroupOfRiders group) {
	// if (sequenceOfRides.isEmpty() || !canGroupGetOnBoardNow(group)) {
	// Ride ride = new Ride();
	// ride.add(group);
	// sequenceOfRides.add(ride);
	// rideMap.put(group.getId(), ride);
	// currentSequenceId = group.getId();
	// } else {
	// sequenceOfRides.peek().add(group);
	// }
	// gainOfSequence += group.getNumberOfRiders();
	// numberOfGroups++;
	// }
	//
	// public boolean isRidePlacesFull(GroupOfRiders group, long idStartGroup) {
	// boolean canGroupGetOnBoardNow = canGroupGetOnBoardNow(group);
	// if (!canGroupGetOnBoardNow) {
	// return true;
	// }
	// // // First ride
	// // if (sequenceOfRides.isEmpty()) {
	// // return false;
	// // }
	// // // All riders get in the same Ride
	// // if (currentSequenceId == idStartGroup && group.getId() == idStartGroup) {
	// // return true;
	// // }
	// // // First group rides again but can't
	// // if (currentSequenceId != idStartGroup && group.getId() == idStartGroup && !canGroupGetOnBoardNow) {
	// // return true;
	// // }
	// Ride ride = rideMap.get(currentSequenceId);
	// // When a second ride possible
	// if (currentSequenceId != idStartGroup && (ride.getGroupOfRidersMap().containsKey(idStartGroup) || group.getId() == idStartGroup)) {
	// // if (canGroupGetOnBoardNow) {
	// numberOfRidersForASecondRide += group.getNumberOfRiders();
	// numberOfGroupsForASecondRide++;
	// return false;
	// // }
	// // return true;
	// }
	// return false;
	// }
	//
	// public long dailyGain(long numberOfRidesByDay, RollerCoasterQueue rollerCoasterQueue) {
	//
	// long nb = gainOfSequence - numberOfRidersForASecondRide;
	// long numberOfRidesByDayDividedBySequences = numberOfRidesByDay / sequenceOfRides.size();
	// // return (gainOfSequence - numberOfRidersForASecondRide) * (numberOfRidesByDayDividedBySequences) //
	// // + numberOfRidersForASecondRide;
	// return gainOfSequence;
	// }
	//
	// public void addNewRide(GroupOfRiders group) {
	// Ride ride = new Ride();
	// ride.add(group);
	// sequenceOfRides.add(ride);
	// rideMap.put(group.getId(), ride);
	// currentSequenceId = group.getId();
	// gainOfSequence += group.getNumberOfRiders();
	// numberOfGroups++;
	// }
	//
	// public void addNextGroupToCurrentRide(GroupOfRiders group) {
	// sequenceOfRides.peek().add(group);
	// gainOfSequence += group.getNumberOfRiders();
	// numberOfGroups++;
	// }
	//
	// public HashMap<Long, Ride> getRideMap() {
	// return rideMap;
	// }
	//
	// public void addRideMemorized(long idOfFirstGroup) {
	// Ride ride = rideMap.get(idOfFirstGroup);
	// gainOfSequence += ride.getNumberOfRiders();
	// }
	//
	// public boolean isMapOfRideContainsKey(long idOfFirstGroup) {
	// return rideMap.containsKey(idOfFirstGroup);
	// }
	//
	// public long getNumberOfGroupOfRideMemorized(long idOfFirstGroup) {
	// Ride ride = rideMap.get(idOfFirstGroup);
	// return ride.getGroupOfRiders().size();
	// }

}
