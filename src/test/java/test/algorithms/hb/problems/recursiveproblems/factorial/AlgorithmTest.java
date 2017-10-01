package test.algorithms.hb.problems.recursiveproblems.factorial;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

import org.junit.Test;

import algorithms.hb.problems.recursiveproblems.factorial.Algorithm;

public class AlgorithmTest {
	
	private final static Algorithm ALGO = new Algorithm();
	
	@Test
	public void factorialWithMemoizationShouldReturn24(){
		assertThat(ALGO.factorial(4), equalTo(24));
	}
	
	@Test
	public void factorialWithoutMemoizationShouldReturn24(){
		assertThat(ALGO.factorialWithoutMemoization(4), equalTo(24));
	}
	
	@Test
	public void factorialWithMemoizationShouldBeFasterThanFacotrialWithoutMemoization(){
		assertThat(calculateTimeRecusion(false,10), greaterThan(calculateTimeRecusion(true, 10)) );
	}
	
	private long calculateTimeRecusion(boolean withMemoization, int number) {
		long startTime = System.nanoTime();
		if(withMemoization)
			ALGO.factorial(number);
		else
			ALGO.factorialWithoutMemoization(number);
		long endTime = System.nanoTime();
		return (endTime - startTime);
	}

}
