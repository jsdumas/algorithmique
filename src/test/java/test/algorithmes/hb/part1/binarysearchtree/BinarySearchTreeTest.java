package test.algorithmes.hb.part1.binarysearchtree;

import algorithmes.hb.part1.binarysearchtree.BinarySearchTree;
import algorithmes.hb.part1.binarysearchtree.Tree;

public class BinarySearchTreeTest {

	private Tree initBST() {
		// O(N) OR O(logN)
		Tree<Person> bst = new BinarySearchTree<>();
		bst.insert(new Person("Adam", 27));
		bst.insert(new Person("Kevin", 13));
		bst.insert(new Person("Joe", 67));
		bst.insert(new Person("Michael", 2));
		bst.insert(new Person("Smith", 11));

		bst.traversal();
		return bst;
	}

}
