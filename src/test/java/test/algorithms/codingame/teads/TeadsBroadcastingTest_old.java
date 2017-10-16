package test.algorithms.codingame.teads;

import java.util.Map;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import algorithms.codingame.teads.TeadsBroadcasting_old;

public class TeadsBroadcastingTest_old {

	private static final TeadsBroadcasting_old TEADS_BROADCASTING = new TeadsBroadcastingBuilder(8).with(1, 2).with(2, 3).with(3, 4).with(3, 7)
			.with(4, 5).with(4, 6).with(7, 8).build();
	private static final Map<Integer, Integer> MEMOIZE_TABLE = TEADS_BROADCASTING.getMemoizeTable();
	private static final int VERTEX_ONE = 0;
	private static final int VERTEX_TWO = 1;
	private static final int VERTEX_THREE = 2;
	private static final int VERTEX_FOR = 3;
	private static final int VERTEX_FIVE = 4;
	private static final int VERTEX_SIX = 5;
	private static final int VERTEX_SEVEN = 6;
	private static final int VERTEX_EIGHT = 7;
	private static final int HAS_ONLY_ONE_EDGE = 1;

	@Test
	public void vertexOneShouldOnlyHaveOneEdge() {
		MatcherAssert.assertThat(MEMOIZE_TABLE.get(VERTEX_ONE), Matchers.equalTo(HAS_ONLY_ONE_EDGE));
	}

	@Test
	public void shouldReturnEdgesNumberByVertex() {
		MatcherAssert.assertThat(MEMOIZE_TABLE.values(), Matchers.containsInAnyOrder(1, 2, 3, 3, 2, 1, 1, 1));
	}

	@Test
	public void shouldReturnAllVerticesWhichOnlyHaveOneEdge() {
		MatcherAssert.assertThat(TEADS_BROADCASTING.getVerticesWithOneEdge(), Matchers.containsInAnyOrder(VERTEX_ONE, VERTEX_FIVE,
				VERTEX_SIX, VERTEX_EIGHT));
	}

	@Test
	public void shouldReturnAllVerticesWhichHaveMoreThanOneEdge() {
		MatcherAssert.assertThat(TEADS_BROADCASTING.getVerticesWithSeveralEdges(), Matchers.containsInAnyOrder(VERTEX_TWO, VERTEX_THREE,
				VERTEX_FOR, VERTEX_SEVEN));
	}

	@Test
	public void shouldReturnTwoHoursDiffusion() {
		MatcherAssert.assertThat(TEADS_BROADCASTING.getBroadcastHour(), Matchers.equalTo(2));
	}
}
