package test.algorithms.codingame.teads;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import algorithms.codingame.teads.TeadsBroadcasting;

public class TeadsBroadcastingTest {

	private static final TeadsBroadcasting TEADS_BROADCASTING = new TeadsBroadcasting(3);

	private void initNeighbourList() {
		TEADS_BROADCASTING.addNeighbour(1, 2);
		TEADS_BROADCASTING.addNeighbour(2, 3);
		TEADS_BROADCASTING.broadcast();
	}

	@Test
	public void vertexOneShouldBroadcastInTwoHours() {
		initNeighbourList();
		// TEADS_BROADCASTING.getMemoizeTable();
		MatcherAssert.assertThat(TEADS_BROADCASTING.getVertexList().get(1).getBroadcastingHour(), Matchers.equalTo(2));

	}

	// @Test
	// public void vertexTwoShouldBroadcastInOneHour() {
	// initNeighbourList();
	// Vertex vertexTwo = TEADS_BROADCASTING.getVertexList().get(2);
	// MatcherAssert.assertThat(vertexTwo.getBroadcastingHour(), Matchers.equalTo(2));
	//
	// }

}
