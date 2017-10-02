package algorithms.hb.problems.recursiveproblems.towersofhanoi;

public class TowerOfHanoi {

	// Exponential algorithm time
	public void solveHanoiProblem(int plateNumber, char rodFrom, char middleRod, char rodTo){
		if( plateNumber == 1 ){
			System.out.println("Plate 1 from " + rodFrom + " to " + rodTo);
			return;
		}
		solveHanoiProblem(plateNumber-1, rodFrom, rodTo, middleRod);
		System.out.println("Plate " + plateNumber + " from " + rodFrom + " to " + rodTo);
		solveHanoiProblem(plateNumber-1, middleRod, rodFrom, rodTo);
	}
}
