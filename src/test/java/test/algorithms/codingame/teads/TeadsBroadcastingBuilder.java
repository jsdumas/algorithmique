package test.algorithms.codingame.teads;

import algorithms.codingame.teads.TeadsBroadcasting_old;

public class TeadsBroadcastingBuilder {

	public final TeadsBroadcasting_old teadsBroadcasting_old;

	public TeadsBroadcastingBuilder(int size) {
		this.teadsBroadcasting_old = new TeadsBroadcasting_old(size);
	}

	public TeadsBroadcastingBuilder with(int vertexFrom, int vertexTo) {
		this.teadsBroadcasting_old.addEdge(vertexFrom - 1, vertexTo - 1);
		return this;
	}

	public TeadsBroadcasting_old build() {
		return this.teadsBroadcasting_old;
	}

}
