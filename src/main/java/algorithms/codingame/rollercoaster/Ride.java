package algorithms.codingame.rollercoaster;

public class Ride {

	private static final long ZERO = 0;
	private final RollerCoasterQueue rollerCoasterQueue;
	private long busyPlace;
	private RollerCoaster rollerCoaster;
	private boolean isTheNextGroupTheFirstOfNextWaitingGroups;

	public Ride(RollerCoaster rollerCoaster) {
		this.rollerCoaster = rollerCoaster;
		rollerCoaster.getPlaceNumberForARide();
		this.busyPlace = ZERO;
		this.rollerCoasterQueue = rollerCoaster.getWaitingQueue();
		this.isTheNextGroupTheFirstOfNextWaitingGroups = false;
	}

	public boolean canNextGroupGetOnBoard() {
		return  rollerCoaster.areEnoughPlacesForNextGroup(busyPlace)
				&& !(isTheNextGroupTheFirstOfNextWaitingGroups && rollerCoasterQueue.isTheLastGroupOnBoardTheFirstOfNextWaitingGroups());
	}

	public long boardingRiders() {
		while (canNextGroupGetOnBoard()) {
			busyPlace += rollerCoasterQueue.getNumberOfNextRiders();
			isTheNextGroupTheFirstOfNextWaitingGroups = rollerCoasterQueue.isTheNextGroupTheFirstOfNextWaitingGroups();
		}
		return busyPlace;
	}

}

