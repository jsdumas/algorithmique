package algorithms.codingame.rollercoaster;

import java.util.LinkedList;
import java.util.Queue;

/** @link GainTest **/
public class Gain {

	private final RollerCoaster rollerCoaster;

	public Gain(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
	}

	public long dailyGainOfRollerCoaster() {
		Queue<GroupOfPerson> waitingGroupForThisRide = new LinkedList<GroupOfPerson>();
		waitingGroupForThisRide.addAll(rollerCoaster.getWaitingQueue().getWaitingGroupsOfPersons());
		long numberOfWaitingGroups = waitingGroupForThisRide.size();
		int queueStartId = 0;
		long gain = 0;
		for (long i = 0; i < rollerCoaster.getRideNumberByDay(); i++) {
			int currentCapacity = 0;
			int currentGroupId = queueStartId;
			boolean allWaitingGroupsArePassed = false;
			while (currentCapacity + waitingGroupForThisRide.peek().getNumberOfPerson() <= rollerCoaster.getPlaceNumberForARide() //
					&& !(allWaitingGroupsArePassed && currentGroupId == queueStartId)) {

				GroupOfPerson nextGroupForARide = waitingGroupForThisRide.poll();
				currentCapacity += nextGroupForARide.getNumberOfPerson();
				waitingGroupForThisRide.add(nextGroupForARide);
				if (++currentGroupId == numberOfWaitingGroups) {
					currentGroupId = 0;
					allWaitingGroupsArePassed = true;
				}
			}
			queueStartId = currentGroupId;
			gain += currentCapacity;
		}
		return gain;
	}

}
