package test.algorithms.codingame.dwaresandgiants;

import java.util.Hashtable;
import java.util.Map;

import algorithms.codingame.dwaresandgiants.Person;

public class InfluencerBuilder {
	
	private Map<Integer, Person> personDirectory;

	public InfluencerBuilder(int influencerNumber) {
		personDirectory = new Hashtable<>();
		initPersonDirectory(influencerNumber);
	}

	private void initPersonDirectory(int influencerNumber) {
		for(int i=1; i<influencerNumber+1; i++) {
			personDirectory.put(i, new Person(i));
		}
	}

	public InfluencerBuilder withInheritance(int idPredecessor, int idHeir) {
		personDirectory.get(idPredecessor).addHeir(personDirectory.get(idHeir));
		return this;
	}

	public Person build() {
		return personDirectory.get(1);
	}

}
