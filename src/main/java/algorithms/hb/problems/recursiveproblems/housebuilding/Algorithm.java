package algorithms.hb.problems.recursiveproblems.housebuilding;

public class Algorithm {

	//Head recursion uses operating system stack memory
	public void buildHeadRecursionLayers(int height){
		if( height == 0 ) return;
		buildHeadRecursionLayers(height-1);
		System.out.println(height);	
	}
	
	
	//Tail recursion runs like an iterative loop
	public void buildTailRecursionLayers(int height){
		if( height == 0 ) return;
		System.out.println(height);	
		buildTailRecursionLayers(height-1);
	}
	

}
