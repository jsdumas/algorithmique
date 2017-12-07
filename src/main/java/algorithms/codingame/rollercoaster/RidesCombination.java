package algorithms.codingame.rollercoaster;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RidesCombination {

	public RidesPossible getRidesPossible(long capacity, Queue<GroupOfRiders> waitingGroupsOfRidersQueue) {
		HashMap<Long, Ride> rideMap = new HashMap<Long, Ride>();
		Queue<GroupOfRiders> currentRide = new LinkedList<GroupOfRiders>();
		for (long i = 0; i < waitingGroupsOfRidersQueue.size(); i++) {
			Ride ride = new Ride(i);
			if (currentRide.isEmpty()) {
				GroupOfRiders group = waitingGroupsOfRidersQueue.poll();
				currentRide.add(group);
				waitingGroupsOfRidersQueue.add(group);
				ride.add(group);
			}
			while (canGroupGetOnBoardNow(capacity, ride, waitingGroupsOfRidersQueue.peek())) {
				GroupOfRiders group = waitingGroupsOfRidersQueue.poll();
				currentRide.add(group);
				ride.add(group);
				waitingGroupsOfRidersQueue.add(group);
			}
			rideMap.put(i, ride);
			currentRide = new LinkedList<GroupOfRiders>();
		}
		return new RidesPossible(rideMap);
	}

	public boolean canGroupGetOnBoardNow(long capacity, Ride ride, GroupOfRiders group) {
		return ride.getNumberOfRiders() + group.getNumberOfRiders() <= capacity;
	}

}
