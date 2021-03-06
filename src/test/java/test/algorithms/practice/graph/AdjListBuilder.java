package test.algorithms.practice.graph;

import java.util.LinkedList;
import java.util.Map;

import algorithms.practice.graph.AdjList;

public class AdjListBuilder {
	
	private AdjList<Integer> graph;
	
	public AdjListBuilder(){
		this.graph = new AdjList<Integer>();
	}
	
	public AdjList<Integer> build(){
		return this.graph;
	}
	
	public AdjListBuilder withVertex(Integer number){
		this.graph.addVertex(number);
		return this;
	}
	
	public AdjListBuilder withEdge(Integer from, Integer to){
		this.graph.addEdge(from, to);
		return this;
	}

}
