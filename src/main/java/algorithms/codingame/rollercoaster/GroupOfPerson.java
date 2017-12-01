package algorithms.codingame.rollercoaster;

public class GroupOfPerson {

	private final long id;
	private final long numberOfPerson;

	public GroupOfPerson(long id, long numberOfPerson) {
		this.id = id;
		this.numberOfPerson = numberOfPerson;
	}

	public long getNumberOfPerson() {
		return numberOfPerson;
	}

	public long getId() {
		return id;
	}

}
