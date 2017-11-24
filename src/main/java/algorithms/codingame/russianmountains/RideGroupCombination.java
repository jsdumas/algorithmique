package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class RideGroupCombination {

	private final Queue<GroupOfPerson> groupQueue;
	private final AllGroupsByRide allGroupsByRide;

	public RideGroupCombination(RussianMountains russianMountains) {
		this.groupQueue = new LinkedList<GroupOfPerson>();
		this.groupQueue.addAll(russianMountains.getGroupOfPerson());
		this.allGroupsByRide = initAllGroupsByRide(russianMountains.getPlaceNumber());
	}

	private AllGroupsByRide initAllGroupsByRide(long placeNumber) {
		AllGroupsByRide allGroupsByRide = new AllGroupsByRide(placeNumber);
		while (!groupQueue.isEmpty()) {
			allGroupsByRide.add(groupQueue.poll());
		}
		return allGroupsByRide;
	}

	public long getCombinationNumber() {
		return allGroupsByRide.getNumber();
	}

	public Queue<GroupByRide> getAllGroupsByRide() {
		Queue<GroupByRide> allRideGroups = new LinkedList<GroupByRide>();
		allRideGroups.addAll(allGroupsByRide.getAllRideGroups());
		return allRideGroups;
	}

}
