package algorithms.hb.part1.avl.generic.runtime;

import algorithms.hb.part1.avl.generic.AvlTree;
import algorithms.hb.part1.avl.generic.Tree;

public class App {

	public static void main(String[] args) {

		Tree<String> avl = new AvlTree<>();

		avl.insert("a");
		avl.insert("c");
		avl.insert("b");

		//avl.delete(5);
		
		avl.traverse();
	}
	
}
