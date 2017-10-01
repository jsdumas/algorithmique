package algorithms.hb.problems.recursiveproblems.factorial;

public class Algorithm {

	//Accumulator parameter allows to avoid poping information from stack.
	//This technique is faster beacause, it returns directly the result without poping
	//that is a kind of memoization
	public int fact(int accumulator, int n){
		if( n == 1 ) return accumulator;
		return fact(accumulator*n, n-1);	
	}
	
	public int factorial(int n){
		return fact(1, n);
	}
	
	//Slower than the first method because it does not memorise the result and obliged stack memory system to pop every method call
	public int factorialWithoutMemoization(int n){
		if(n==1) return 1;
		return n * factorialWithoutMemoization(n-1);
	}
}
