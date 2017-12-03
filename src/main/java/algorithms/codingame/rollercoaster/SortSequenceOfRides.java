package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

public class SortSequenceOfRides {

	private final Queue<GroupOfRiders> waitingGroupsOfRidersQueue;

	public SortSequenceOfRides(Queue<GroupOfRiders> groupsOfRidersQueue) {
		this.waitingGroupsOfRidersQueue = new LinkedList<GroupOfRiders>();
		this.waitingGroupsOfRidersQueue.addAll(groupsOfRidersQueue);
	}

	public SequenceOfRides getSequence(long rollerCoasterCapacity, long numberOfRidesByDay) {
		SequenceOfRides sequenceOfRides = new SequenceOfRides(rollerCoasterCapacity);
		while (true) {
			if(sequenceOfRides.isSequenceFinished(waitingGroupsOfRidersQueue.peek())){
				break;
			}
			GroupOfRiders groupOfRiders = waitingGroupsOfRidersQueue.poll();
			sequenceOfRides.add(groupOfRiders);
			waitingGroupsOfRidersQueue.add(groupOfRiders);
		}
		return sequenceOfRides;
	}

}
