package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

/** @link RollerCoasterTest **/
public class DaylyRides {

	private final Queue<GroupOfRiders> waitingGroupsOfRidersQueue;
	private final RollerCoasterQueue rollerCoasterQueue;
	private final RollerCoaster rollerCoaster;

	public DaylyRides(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
		this.rollerCoasterQueue = rollerCoaster.getRollerCoasterQueue();
		this.waitingGroupsOfRidersQueue = new LinkedList<GroupOfRiders>();
		this.waitingGroupsOfRidersQueue.addAll(rollerCoasterQueue.getGroupsOfRiders());
	}

	private SequenceOfRides sortSequences() {
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
