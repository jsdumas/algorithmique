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
	
	private static final String LINE_1 = "#@#";
	private static final String LINE_2 = "# #";
	private static final String LINE_3 = "###";
	private static final BenderMap CASE_START_AND_GET_SOUTH = new BenderMapBuilder(3,3).withLine(1, LINE_1).withLine(2, LINE_2).build();
	private static final BenderMap CASE_START_AND_GET_LOOP = new BenderMapBuilder(3,3).withLine(1, LINE_1).withLine(2, LINE_3).build();
	
	
	@Test
	public void shouldGetSouth() {
		Bender bender = new Bender(CASE_START_AND_GET_SOUTH);
		assertThat(bender.walkTo(), equalTo(SOUTH.toString()));
	}
	
	@Test
	public void shouldGetLoop() {
		Bender bender = new Bender(CASE_START_AND_GET_LOOP);
		assertThat(bender.walkTo(), equalTo(LOOP.toString()));
	}

}
