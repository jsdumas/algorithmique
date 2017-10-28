package test.algorithms.codingame.bender;

import static algorithms.codingame.bender.Direction.EAST;
import static algorithms.codingame.bender.Direction.LOOP;
import static algorithms.codingame.bender.Direction.NORTH;
import static algorithms.codingame.bender.Direction.SOUTH;
import static algorithms.codingame.bender.Direction.WEST;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import algorithms.codingame.bender.Bender;
import algorithms.codingame.bender.BenderBuilder;
import algorithms.codingame.bender.BenderMap;
import algorithms.codingame.bender.Direction;

public class BenderTest {
	
	private static final String LINE_START = "#@#";
	private static final String LINE_START_END = "#@$";
	private static final String LINE_CHARP = "###";
	private static final String LINE_DOLLAR = "$$$";
	private static final String LINE_X = "XXX";
	private static final String LINE_S = "SSS";
	private static final String LINE_E = "EE$";
	private static final String LINE_EEN = "EEN";
	private static final String LINE_I = "$I#";
	private static final String LINE_W = "$WW";
	private static final Bender BENDER_WALK_TO_SOUTH_FROM_START = new BenderBuilder(2,3).withLine(0, LINE_START).withLine(1, LINE_DOLLAR).build();
	private static final Bender BENDER_LOOP_WALK_BECAUSE_OF_CHARP = new BenderBuilder(3,3).withLine(0, LINE_CHARP).withLine(1, LINE_START).withLine(2, LINE_CHARP).build();
	private static final Bender BENDER_LOOP_WALK_BECAUSE_OF_X = new BenderBuilder(3,3).withLine(0, LINE_CHARP).withLine(1, LINE_START).withLine(2, LINE_X).build();
	private static final Bender BENDER_WALK_TO_SOUTH_FROM_S_MODIFIER = new BenderBuilder(3,3).withLine(0, LINE_START).withLine(1, LINE_S).withLine(2, LINE_DOLLAR).build();
	private static final Bender BENDER_WALK_TO_EAST_FROM_E_MODIFIER = new BenderBuilder(2,3).withLine(0, LINE_START).withLine(1, LINE_E).build();
	private static final Bender BENDER_WALK_TO_NORTH_FROM_N_MODIFIER = new BenderBuilder(2,3).withLine(0, LINE_START_END).withLine(1, LINE_EEN).build();
	private static final Bender BENDER_WALK_TO_WEST_FROM_W_MODIFIER = new BenderBuilder(2,3).withLine(0, LINE_START).withLine(1, LINE_W).build();
	private static final Bender BENDER_WALK_TO_WEST_FROM_INVERSOR = new BenderBuilder(3,3).withLine(0, LINE_START).withLine(1, LINE_I).withLine(2, LINE_CHARP).build();
	
	
	@Test
	public void shouldGetSouthFromStart() {
		assertThat(BENDER_WALK_TO_SOUTH_FROM_START.printDirection(), equalTo(SOUTH.toString()));
	}

	@Test
	public void shouldGetLoopFromStartBecauseOfCharp() {
		assertThat(BENDER_LOOP_WALK_BECAUSE_OF_CHARP.printDirection(), equalTo(LOOP.toString()));
	}
	
	@Test
	public void shouldGetLoopFromStartBecauseOfX() {
		assertThat(BENDER_LOOP_WALK_BECAUSE_OF_X.printDirection(), equalTo(LOOP.toString()));
	}
	
	@Test
	public void shouldGetSouthFromSouthModifier() {
		assertThat(BENDER_WALK_TO_SOUTH_FROM_S_MODIFIER.printDirection(), equalTo(SOUTH.toString()+"\n"+SOUTH.toString()));
	}
	
	@Test
	public void shouldGetSouthFromEastModifier() {
		assertThat(BENDER_WALK_TO_EAST_FROM_E_MODIFIER.printDirection(), equalTo(SOUTH.toString()+"\n"+EAST.toString()));
	}
	
	@Test
	public void shouldGetNorthFromNorthModifier() {
		assertThat(BENDER_WALK_TO_NORTH_FROM_N_MODIFIER.printDirection(), equalTo(SOUTH.toString()+"\n"+EAST.toString()+"\n"+NORTH.toString()));
	}
	
	@Test
	public void shouldGetWestFromWestModifier() {
		assertThat(BENDER_WALK_TO_WEST_FROM_W_MODIFIER.printDirection(), equalTo(SOUTH.toString()+"\n"+WEST.toString()));
	}
	
	@Test
	public void shouldGetWestFromInversor() {
		assertThat(BENDER_WALK_TO_WEST_FROM_INVERSOR.printDirection(), equalTo(SOUTH.toString()+"\n"+WEST.toString()));
	}

}
