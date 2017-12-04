package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

/** @link DaylyRidesTest **/
public class DaylyRides {

	private final RollerCoasterQueue rollerCoasterQueue;
	private final RollerCoaster rollerCoaster;

	public DaylyRides(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
		this.rollerCoasterQueue = rollerCoaster.getRollerCoasterQueue();
	}

	private SequenceOfRides sortSequences() {
		Queue<GroupOfRiders> waitingGroupsOfRidersQueue = new LinkedList<GroupOfRiders>();
		waitingGroupsOfRidersQueue.addAll(rollerCoasterQueue.getGroupsOfRiders());
		SequenceOfRides sequenceOfRides = new SequenceOfRides(rollerCoaster.getCapacity());
		while (true) {
			if (sequenceOfRides.isSequenceFinished(waitingGroupsOfRidersQueue.peek())) {
				break;
			}
			GroupOfRiders groupOfRiders = waitingGroupsOfRidersQueue.poll();
			sequenceOfRides.add(groupOfRiders);
			waitingGroupsOfRidersQueue.add(groupOfRiders);
		}
		return sequenceOfRides;
	}

	public long getGain() {
		SequenceOfRides sequenceOfRides = sortSequences();
		return sequenceOfRides.dailyGain(rollerCoaster.getNumberOfRidesByDay(), rollerCoasterQueue);
	}

}
