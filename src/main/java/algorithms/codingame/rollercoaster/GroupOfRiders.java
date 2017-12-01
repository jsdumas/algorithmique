package algorithms.codingame.rollercoaster;

public class GroupOfRiders {

	private final long id;
	private final long numberOfRiders;

	public GroupOfRiders(long id, long numberOfPerson) {
		this.id = id;
		this.numberOfRiders = numberOfPerson;
	}

	public long getNumberOfRiders() {
		return numberOfRiders;
	}

	public long getId() {
		return id;
	}

}
