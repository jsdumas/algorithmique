package algorithms.codingame.dwaresandgiants;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private final int id;
	private List<Person> heirs;
	private boolean visited;
	private Person predecessor;

	public Person(int id) {
		this.id = id;
		this.heirs = new ArrayList<>();
	}

	public void addHeir(Person person) {
		this.heirs.add(person);
	}

	public Person getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Person predecessor) {
		this.predecessor = predecessor;
	}


	public int getId() {
		return id;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Person> getHeirs() {
		return heirs;
	}

}
