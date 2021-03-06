package algorithms.hb.part2.ternarysearchtree;

public class TST {

	private Node rootNode;

	public void put(String key, int val) {
		rootNode = put(rootNode, key, val, 0);
	}

	private Node put(Node node, String key, int value, int index) {

		char c = key.charAt(index);

		if (node == null) {
			node = new Node(c);
		}

		if (c < node.getCharacter()) {
			node.setLeftNode(put(node.getLeftNode(), key, value, index));
		} else if (c > node.getCharacter()) {
			node.setRightNode(put(node.getRightNode(), key, value, index));
		} else if (index < key.length() - 1) {
			node.setMiddleNode(put(node.getMiddleNode(), key, value, index + 1));
		} else {
			node.setValue(value);
		}

		return node;
	}

	public Integer get(String key) {

		Node x = get(rootNode, key, 0);
		
		if (x == null) return null;
		
		return x.getValue();
	}


	private Node get(Node node, String key, int index) {

		if (node == null) return null;
		
		char c = key.charAt(index);
		
		if (c < node.getCharacter()){
			return get(node.getLeftNode(), key, index);
		} else if (c > node.getCharacter()) {
			return get(node.getRightNode(), key, index);
		} else if (index < key.length() - 1) {
			return get(node.getMiddleNode(), key, index + 1);
		} else {
			return node;
		}					
	}
}
