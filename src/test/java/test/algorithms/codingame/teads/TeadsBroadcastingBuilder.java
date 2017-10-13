package test.algorithms.codingame.teads;

import main.algorithms.codingame.teads.TeadsBroadcasting;

public class TeadsBroadcastingBuilder {

	public final TeadsBroadcasting teadsBroadcasting;

	public TeadsBroadcastingBuilder(int size) {
		this.teadsBroadcasting = new TeadsBroadcasting(size);
	}

	public TeadsBroadcastingBuilder with(int vertexFrom, int vertexTo) {
		this.teadsBroadcasting.addEdge(vertexFrom - 1, vertexTo - 1);
		return this;
	}

	public TeadsBroadcasting build() {
		return this.teadsBroadcasting;
	}

}
