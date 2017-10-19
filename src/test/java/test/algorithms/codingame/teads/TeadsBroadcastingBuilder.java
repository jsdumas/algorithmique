package test.algorithms.codingame.teads;

import algorithms.codingame.teads.TeadsBroadcasting;

public class TeadsBroadcastingBuilder {

	public final TeadsBroadcasting teadsBroadcasting;

	public TeadsBroadcastingBuilder() {
		this.teadsBroadcasting = new TeadsBroadcasting();
	}

	public TeadsBroadcastingBuilder with(int vertexFrom, int vertexTo) {
		this.teadsBroadcasting.initGraph(vertexFrom, vertexTo);
		return this;
	}

	public TeadsBroadcasting build() {
		return this.teadsBroadcasting;
	}

}
