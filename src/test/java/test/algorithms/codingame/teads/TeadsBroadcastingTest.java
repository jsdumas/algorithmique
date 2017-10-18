package test.algorithms.codingame.teads;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import algorithms.codingame.teads.TeadsBroadcasting;
import algorithms.codingame.teads.Vertex;

public class TeadsBroadcastingTest {

	private final TeadsBroadcasting TEADS_BROADCASTING = new TeadsBroadcastingBuilder(3).with(1, 2).with(2, 3).withBroadcast().build();

	@Test
	public void vertexOneShouldBroadcastInTwoHours() {
		Vertex vertexOne = TEADS_BROADCASTING.getVertexList().get(1);
		MatcherAssert.assertThat(vertexOne.getBroadcastingHour(), Matchers.equalTo(2));

	}

	@Test
	public void vertexTwoShouldBroadcastInOneHour() {
		Vertex vertexTwo = TEADS_BROADCASTING.getVertexList().get(2);
		MatcherAssert.assertThat(vertexTwo.getBroadcastingHour(), Matchers.equalTo(1));
	}

}
