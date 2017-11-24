package algorithms.codingame.russianmountains;

import java.util.LinkedList;
import java.util.Queue;

public class RideGroupCombination {

	private final Queue<GroupOfPerson> groupQueue;
	private final AllGroupsByRide allGroupsByRide;

	public RideGroupCombination(int maxPlaceNumber, Queue<GroupOfPerson> groupQueue) {
		this.groupQueue = new LinkedList<GroupOfPerson>();
		this.groupQueue.addAll(groupQueue);
		this.allGroupsByRide = new AllGroupsByRide(maxPlaceNumber);
	}

	public long getCombinationNumber() {
		if (allGroupsByRide.getIsDefined()) {
			return allGroupsByRide.getNumber();
		}
		while (!groupQueue.isEmpty()) {
			allGroupsByRide.add(groupQueue.poll());
		}
		allGroupsByRide.setIsDefined(true);
		return allGroupsByRide.getNumber();
	}

}
