package test.algorithms.hb.problems.recursiveproblems.addingnumbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.*;
import org.junit.Test;

import algorithms.hb.problems.recursiveproblems.addingnumbers.Algorithm;

public class AlgorithmTest {
	
	private final static Algorithm ALGO = new Algorithm();
	
	@Test
	public void shouldRecursionReturn6(){
		assertThat(ALGO.sumRecursive(3), is(equalTo(6)));
	}
	
	@Test
	public void shouldIterationReturn6(){
		assertThat(ALGO.sumRecursive(3), is(equalTo(6)));
	}
	
	@Test
	public void recursionShouldBeSlowerThanIteration(){
		Long iterationTime = calculTime(true, 1000);
		Long recursionTime = calculTime(false, 1000);
		assertThat(recursionTime, greaterThan(iterationTime));
	}

	private long calculTime(boolean iteration, int number) {
		long startTime = System.nanoTime();
		if(iteration)
			ALGO.sumIterative(number);
		else
			ALGO.sumRecursive(number);
		long endTime = System.nanoTime();
		return (endTime - startTime);
	}


}
