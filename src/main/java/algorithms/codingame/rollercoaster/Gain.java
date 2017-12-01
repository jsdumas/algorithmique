package algorithms.codingame.rollercoaster;

/** @link GainTest **/
public class Gain {

	private final RollerCoaster rollerCoaster;

	public Gain(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
	}

	public long dailyGainOfRollerCoaster() {
		RollerCoasterQueue rollerCoasterQueue = rollerCoaster.getWaitingQueue();
		long numberOfWaitingGroups = rollerCoasterQueue.getWaitingGroupsOfPersons().size();
		int queueStartId = 0;
		long gain = 0;
		for (long i = 0; i < rollerCoaster.getRideNumberByDay(); i++) {
			int currentCapacity = 0;
			int currentGroupId = queueStartId;
			boolean allWaitingGroupsArePassed = false;
			while (rollerCoasterQueue.canNextGroupGetIn(currentCapacity, rollerCoaster.getPlaceNumberForARide()) //
					&& !(allWaitingGroupsArePassed && currentGroupId == queueStartId)) {

				GroupOfPerson nextGroupForARide = rollerCoasterQueue.getWaitingGroupsOfPersons().poll();
				currentCapacity += nextGroupForARide.getNumberOfPerson();
				rollerCoasterQueue.getWaitingGroupsOfPersons().add(nextGroupForARide);
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
