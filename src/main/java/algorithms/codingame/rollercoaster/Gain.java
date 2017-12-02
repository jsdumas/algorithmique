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
			long currentGroupId = ZERO;
			boolean allWaitingGroupsArePassed = false;
			Ride ride = new Ride(rollerCoaster.getPlaceNumberForARide());
			while (ride.canNextGroupGetIn(rollerCoaster.getNumberOfRidersOfNextGroup()) //
					&& !(allWaitingGroupsArePassed && currentGroupId == ZERO)) {
				ride.addBusyPaces(rollerCoasterQueue.getNumberOfNextRiders());
				allWaitingGroupsArePassed = rollerCoasterQueue.areAllWaitingGroupsPassed();
				currentGroupId = rollerCoasterQueue.getNextGroupForARideId();
			}
			gain += ride.getBusyPlaces();
		}
		return gain;
	}

}
