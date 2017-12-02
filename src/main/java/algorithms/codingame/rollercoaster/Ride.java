package algorithms.codingame.rollercoaster;

public class Ride {

	private static final long ZERO = 0;
	private final RollerCoasterQueue rollerCoasterQueue;
	private long busyPlace;
	private RollerCoaster rollerCoaster;
	private boolean isTheFirstGroupReadyForAnotherRide;

	public Ride(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
		rollerCoaster.getPlaceNumberForARide();
		this.busyPlace = ZERO;
		this.rollerCoasterQueue = rollerCoaster.getWaitingQueue();
		this.isTheFirstGroupReadyForAnotherRide = false;
	}

	public boolean canNextGroupGetOnBoard() {
		return  rollerCoaster.areEnoughPlacesForNextGroup(busyPlace)
				&& !(isTheFirstGroupReadyForAnotherRide && rollerCoasterQueue.isTheFirstGroupOfRiders());
	}

	public long boardingRiders() {
		while (canNextGroupGetOnBoard()) {
			busyPlace += rollerCoasterQueue.getNumberOfNextRiders();
			isTheFirstGroupReadyForAnotherRide = rollerCoasterQueue.areAllWaitingGroupsPassed();
		}
		return busyPlace;
	}

}
