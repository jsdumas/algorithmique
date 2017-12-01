package algorithms.codingame.rollercoaster;

/** @link GainTest **/
public class Gain {

	private static final long ZERO = 0;
	private final RollerCoaster rollerCoaster;

	public Gain(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
	}

	public long dailyGainOfRollerCoaster() {
		RollerCoasterQueue rollerCoasterQueue = rollerCoaster.getWaitingQueue();
		long gain = 0;
		for (long i = 0; i < rollerCoaster.getRideNumberByDay(); i++) {
			int currentRideCapacity = 0;
			long currentGroupId = ZERO;
			boolean allWaitingGroupsArePassed = false;
			while (rollerCoasterQueue.canNextGroupGetIn(currentRideCapacity, rollerCoaster.getPlaceNumberForARide()) //
					&& !(allWaitingGroupsArePassed && currentGroupId == ZERO)) {
				currentRideCapacity += rollerCoasterQueue.getNumberOfNextRiders();
				allWaitingGroupsArePassed = rollerCoasterQueue.areAllWaitingGroupsPassed();
				currentGroupId = rollerCoasterQueue.getNextGroupForARideId();
			}
			gain += currentRideCapacity;
		}
		return gain;
	}

}
