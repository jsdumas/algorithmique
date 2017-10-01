package algorithms.hb.problems.recursiveproblems.addingnumbers;

public class Algorithm {

	//Slower than iteration because recursion use system stack
	//recursive stack information then unstack information 
	public int sumRecursive(int N){
		if( N == 1 ) return 1;
		return N + sumRecursive(N-1);
	}
	
	public int sumIterative(int N){
		int result = 0;
		for(int i=1;i<=N;++i){
			result += i;
		}
		return result;
	}
}
