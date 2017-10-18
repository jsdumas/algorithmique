package test.algorithms.codingame.teads;

import algorithms.codingame.teads.TeadsBroadcasting;

public class TeadsBroadcastingBuilder {

	public final TeadsBroadcasting teadsBroadcasting;

	public TeadsBroadcastingBuilder(int size) {
		this.teadsBroadcasting = new TeadsBroadcasting(size);
	}

	public TeadsBroadcastingBuilder with(int vertexFrom, int vertexTo) {
		this.teadsBroadcasting.addNeighbour(vertexFrom, vertexTo);
		return this;
	}

	public TeadsBroadcastingBuilder withBroadcast() {
		this.teadsBroadcasting.broadcast();
		return this;
	}

	public TeadsBroadcasting build() {
		return this.teadsBroadcasting;
	}

}
