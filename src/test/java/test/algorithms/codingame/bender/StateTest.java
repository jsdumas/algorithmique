package test.algorithms.codingame.bender;

import static algorithms.codingame.bender.CaseType.CHARP_OBSTACLE;
import static algorithms.codingame.bender.CaseType.START;
import static algorithms.codingame.bender.Direction.SOUTH;
import static algorithms.codingame.bender.Direction.WEST;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import algorithms.codingame.bender.BenderMap;
import algorithms.codingame.bender.BenderState;
import algorithms.codingame.bender.CaseType;
import algorithms.codingame.bender.Direction;
import algorithms.codingame.bender.Feasible;
import algorithms.codingame.bender.StateFactory;

public class StateTest {
	
	
	private static final StateFactory STATE_FACTORY = new StateFactory();
	
	@Test
	public void shouldGetSouth() {
		BenderState at = STATE_FACTORY.getState(START.getChar());
		assertThat(at.getDirection(), equalTo(SOUTH.getDirection()));
	}
	
	@Test
	public void shouldGetWest() {
		BenderState charp = STATE_FACTORY.getState(CHARP_OBSTACLE.getChar());
		assertThat(charp.getDirection(), equalTo(WEST.getDirection()));
	}
	
//	@Test
//	public void shouldDisplayLoop() {
//		Feasible suicideCase = (Feasible) STATE_FACTORY.getState(SUICIDE);
//		MatcherAssert.assertThat(suicideCase.getDirection(), Matchers.equalTo(Direction.SOUTH.getDirection()));
//	}

}
