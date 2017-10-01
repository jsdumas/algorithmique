package algorithms.hb.problems.recursiveproblems.housebuilding;

public class App {

	public static void main(String[] args) {
		HouseBuilding algorithm = new HouseBuilding();
		algorithm.buildHeadRecursionLayers(4);
		System.out.println("");
		System.out.println("#");
		System.out.println("");
		algorithm.buildTailRecursionLayers(4);
	}
}
