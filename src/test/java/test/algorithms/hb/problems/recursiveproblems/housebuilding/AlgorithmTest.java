package test.algorithms.hb.problems.recursiveproblems.housebuilding;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import org.junit.Test;

import algorithms.hb.problems.recursiveproblems.housebuilding.Algorithm;

public class AlgorithmTest {
	
	private final static Algorithm ALGO = new Algorithm();
	
	@Test
	public void headRecursionShouldBeSlowerThanTailRecursion(){
		long headRecursionTime = calculateTimeRecusion(true, 100);
		long tailRecursionTime = calculateTimeRecusion(true, 100);
		assertThat(headRecursionTime , greaterThan(tailRecursionTime));
	}

	private long calculateTimeRecusion(boolean isHead, int number) {
		long startTime = System.nanoTime();
		if(isHead)
			ALGO.buildHeadRecursionLayers(number);
		else
			ALGO.buildTailRecursionLayers(number);
		long endTime = System.nanoTime();
		return (endTime - startTime);
	}

}
