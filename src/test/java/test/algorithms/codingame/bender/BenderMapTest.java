package test.algorithms.codingame.bender;

import static algorithms.codingame.bender.Direction.SOUTH;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import algorithms.codingame.bender.BenderMap;

public class BenderMapTest {
	
	private static final String LINE_1 = "#@#";
	private static final String LINE_2 = "# #";
	private static final String LINE_3 = "###";
	private static final BenderMap BENDER_CAN_START = new BenderMapBuilder(4,3).withLine(1, LINE_1).withLine(2, LINE_2).build();
	private static final BenderMap BENDER_CAN_NOT_START = new BenderMapBuilder(4,3).withLine(1, LINE_1).withLine(2, LINE_3).build();
	
	@Test
	public void shouldStart() {
		assertThat(BENDER_CAN_START.start(), equalTo(SOUTH.getDirection()));
	}
	
	@Test
	public void shouldNotStart() {
		assertThat(BENDER_CAN_NOT_START.start(), equalTo(SOUTH.getDirection()));
	}

}
