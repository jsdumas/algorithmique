package test.algorithms.codingame.bender;

import static algorithms.codingame.bender.Direction.EAST;
import static algorithms.codingame.bender.Direction.LOOP;
import static algorithms.codingame.bender.Direction.NORTH;
import static algorithms.codingame.bender.Direction.SOUTH;
import static algorithms.codingame.bender.Direction.WEST;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static test.algorithms.codingame.bender.Path.LOOP_BECAUSE_OF_CHARP;
import static test.algorithms.codingame.bender.Path.LOOP_BECAUSE_OF_X;
import static test.algorithms.codingame.bender.Path.TO_EAST_FROM_E_MODIFIER;
import static test.algorithms.codingame.bender.Path.TO_NORTH_FROM_N_MODIFIER;
import static test.algorithms.codingame.bender.Path.TO_SOUTH_FROM_BIER;
import static test.algorithms.codingame.bender.Path.TO_SOUTH_FROM_START;
import static test.algorithms.codingame.bender.Path.TO_SOUTH_FROM_S_MODIFIER;
import static test.algorithms.codingame.bender.Path.TO_WEST_FROM_INVERSOR;
import static test.algorithms.codingame.bender.Path.TO_WEST_FROM_W_MODIFIER;

import org.junit.Test;

import algorithms.codingame.bender.MemorisePath;

public class PathFinderTest {
	
	private static final PathFinderFactory PATH_FINDER_FACTORY = new PathFinderFactory();
	private static final MemorisePath PATH_TO_SOUTH_FROM_START = PATH_FINDER_FACTORY.getPath(TO_SOUTH_FROM_START);
	private static final MemorisePath PATH_IS_LOOP_BECAUSE_OF_CHARP = PATH_FINDER_FACTORY.getPath(LOOP_BECAUSE_OF_CHARP);
	private static final MemorisePath PATH_IS_LOOP_BECAUSE_OF_X = PATH_FINDER_FACTORY.getPath(LOOP_BECAUSE_OF_X);
	private static final MemorisePath PATH_TO_SOUTH_FROM_S_MODIFIER = PATH_FINDER_FACTORY.getPath(TO_SOUTH_FROM_S_MODIFIER);
	private static final MemorisePath PATH_TO_EAST_FROM_E_MODIFIER = PATH_FINDER_FACTORY.getPath(TO_EAST_FROM_E_MODIFIER);
	private static final MemorisePath PATH_TO_NORTH_FROM_N_MODIFIER = PATH_FINDER_FACTORY.getPath(TO_NORTH_FROM_N_MODIFIER);
	private static final MemorisePath PATH_TO_WEST_FROM_W_MODIFIER = PATH_FINDER_FACTORY.getPath(TO_WEST_FROM_W_MODIFIER);
	private static final MemorisePath PATH_TO_WEST_FROM_INVERSOR = PATH_FINDER_FACTORY.getPath(TO_WEST_FROM_INVERSOR);
	private static final MemorisePath PATH_TO_SOUTH_FROM_BIER = PATH_FINDER_FACTORY.getPath(TO_SOUTH_FROM_BIER);
	
	
	@Test
	public void shouldGetSouthFromStart() {
		assertThat(PATH_TO_SOUTH_FROM_START.printDirection(), equalTo(SOUTH.toString()));
	}

	@Test
	public void shouldGetLoopFromStartBecauseOfCharp() {
		assertThat(PATH_IS_LOOP_BECAUSE_OF_CHARP.printDirection(), equalTo(LOOP.toString()));
	}
	
	@Test
	public void shouldGetLoopFromStartBecauseOfX() {
		assertThat(PATH_IS_LOOP_BECAUSE_OF_X.printDirection(), equalTo(LOOP.toString()));
	}
	
	@Test
	public void shouldGetSouthFromSouthModifier() {
		assertThat(PATH_TO_SOUTH_FROM_S_MODIFIER.printDirection(), equalTo(SOUTH.toString()+"\n"+SOUTH.toString()));
	}
	
	@Test
	public void shouldGetSouthFromEastModifier() {
		assertThat(PATH_TO_EAST_FROM_E_MODIFIER.printDirection(), equalTo(SOUTH.toString()+"\n"+EAST.toString()));
	}
	
	@Test
	public void shouldGetNorthFromNorthModifier() {
		assertThat(PATH_TO_NORTH_FROM_N_MODIFIER.printDirection(), equalTo(SOUTH.toString()+"\n"+EAST.toString()+"\n"+NORTH.toString()));
	}
	
	@Test
	public void shouldGetWestFromWestModifier() {
		assertThat(PATH_TO_WEST_FROM_W_MODIFIER.printDirection(), equalTo(SOUTH.toString()+"\n"+WEST.toString()));
	}
	
	@Test
	public void shouldGetWestFromInversor() {
		assertThat(PATH_TO_WEST_FROM_INVERSOR.printDirection(), equalTo(SOUTH.toString()+"\n"+WEST.toString()));
	}
	
	@Test
	public void shouldGetSouthFromBier() {
		assertThat(PATH_TO_SOUTH_FROM_BIER.printDirection(), equalTo(SOUTH.toString()+"\n"+SOUTH.toString()+"\n"+SOUTH.toString()));
	}

}
