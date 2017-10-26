package test.algorithms.codingame.bender;

import static algorithms.codingame.bender.Direction.LOOP;
import static algorithms.codingame.bender.Direction.SOUTH;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import algorithms.codingame.bender.Bender;
import algorithms.codingame.bender.BenderMap;
import algorithms.codingame.bender.BenderMapBuilder;
import algorithms.codingame.bender.Direction;

public class BenderTest {
	
	private static final String LINE_START = "#@#";
	private static final String LINE_EMPTY = "# #";
	private static final String LINE_CHARP = "###";
	private static final String LINE_X = "XXX";
	private static final BenderMap CASE_START_AND_GET_SOUTH = new BenderMapBuilder(3,3).withLine(0, LINE_CHARP).withLine(1, LINE_START).withLine(2, LINE_EMPTY).build();
	private static final BenderMap CASE_START_AND_GET_LOOP_BECAUSE_OF_CHARP = new BenderMapBuilder(3,3).withLine(0, LINE_CHARP).withLine(1, LINE_START).withLine(2, LINE_CHARP).build();
	private static final BenderMap CASE_START_AND_GET_LOOP_BECAUSE_OF_X = new BenderMapBuilder(3,3).withLine(0, LINE_CHARP).withLine(1, LINE_START).withLine(2, LINE_X).build();
	
	
	@Test
	public void shouldGetSouthFromStart() {
		Bender bender = new Bender(CASE_START_AND_GET_SOUTH);
		assertThat(bender.walkTo(), equalTo(SOUTH.toString()));
	}
	
	@Test
	public void shouldGetLoopFromStartBecauseOfCharp() {
		Bender bender = new Bender(CASE_START_AND_GET_LOOP_BECAUSE_OF_CHARP);
		assertThat(bender.walkTo(), equalTo(LOOP.toString()));
	}
	
	@Test
	public void shouldGetLoopFromStartBecauseOfX() {
		Bender bender = new Bender(CASE_START_AND_GET_LOOP_BECAUSE_OF_X);
		assertThat(bender.walkTo(), equalTo(LOOP.toString()));
	}

}
