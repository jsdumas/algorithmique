package test.algorithmes.backtracking;

import org.junit.Test;

public class QueensTest {

	@Test
	public void test() {
		for (int n = 1; n <= 14; n++) {
			System.out.print("n = " + n + " : ");
			try {
				double start = System.currentTimeMillis();
				findSolution(n);
				double time = System.currentTimeMillis() - start;
				System.out.println("solution found " + time);

				start = System.currentTimeMillis();
				count = 0;
				int fn = naiveCount(n);
				double time1 = System.currentTimeMillis() - start;
				System.out.println("  f(" + n + ")=" + fn + " " + count + " (" + time1 + "ms)");

				start = System.currentTimeMillis();
				count = 0;
				int on = countSolutions(n);
				double time2 = System.currentTimeMillis() - start;
				System.out.println("  f(" + n + ")=" + on + " " + count + " (" + time2 + "ms " + (time1 / time2) + ")");

			} catch (Error e) {
				System.out.println("no solution");
			}
		}
	}

}
