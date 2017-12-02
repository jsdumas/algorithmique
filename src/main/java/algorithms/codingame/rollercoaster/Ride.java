package algorithms.codingame.rollercoaster;

public class Ride {
	
	private static final long ZERO = 0;
	private final long capacity;
	private long busyPlace;
	
	public Ride(long capacity){
		this.capacity = capacity;
		this.busyPlace=ZERO;
	}

	
	public boolean canNextGroupGetIn(long numberOfRiders) {
		return busyPlace + numberOfRiders <= capacity;
	}


	public void addBusyPaces(long numberOfNextRiders) {
		busyPlace+=numberOfNextRiders;
	}


	public long getBusyPlaces() {
		return busyPlace;
	}


}
