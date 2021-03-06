package test.algorithms.hb.problems.recursiveproblems.towersofhanoi;

import java.util.Stack;

import algorithms.hb.problems.recursiveproblems.towersofhanoi.Plate;
import algorithms.hb.problems.recursiveproblems.towersofhanoi.TowerOfHanoi;

public class TowerOfHanoiBuilder {

	private Stack<Plate> plates;

	public TowerOfHanoi build() {
		return new TowerOfHanoi(plates);
	}

	public TowerOfHanoiBuilder withPlate(Plate plate) {
		if (plates == null) {
			plates = new Stack<Plate>();
		}
		plates.push(plate);
		return this;
	}

}
