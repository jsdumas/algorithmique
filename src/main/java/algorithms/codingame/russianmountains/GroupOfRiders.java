package algorithms.codingame.russianmountains;

public class GroupOfRiders {

	private final long id;
	private final long numberOfRiders;

	public GroupOfRiders(long id, long numberOfRiders) {
		this.id = id;
		this.numberOfRiders = numberOfRiders;
	}

	public long getNumberOfPerson() {
		return numberOfRiders;
	}
	
	public long getId() {
		return id;
	}

}
