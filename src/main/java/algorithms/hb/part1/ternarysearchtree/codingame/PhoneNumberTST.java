package algorithms.hb.part1.ternarysearchtree.codingame;

import algorithms.hb.part1.ternarysearchtree.codingame.Node;

public class PhoneNumberTST {

	private Node rootNode;
	private int count = 0;

	public int getNodeNumber() {
		return count;
	}

	public void put(String phoneNumber) {
		String[] phoneNumberArray = phoneNumber.split("");
		for (int i = 0; i < phoneNumberArray.length; i++) {
			int value = Integer.parseInt(phoneNumberArray[i]);
			rootNode = put(rootNode, value);
		}
	}

	private Node put(Node node, int value) {
		if (node == null) {
			node = new Node(value);
		} else {
			if(node.getValue()==value){
				return node.getMiddleNode();
			}
			node.setMiddleNode(new Node(value));
		}
		count++;
		return node;
	}

	@Override
	public String toString() {
		String res="";
		while(rootNode.getMiddleNode()!=null){
			res = res+rootNode.getValue();
			rootNode = rootNode.getMiddleNode();
		}
		return "PhoneNumberTST [rootNode=" + res + "]";
	}
	
	

}
