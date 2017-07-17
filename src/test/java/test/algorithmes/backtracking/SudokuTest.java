package test.algorithme.backtracking;

import java.io.File;
import java.util.Scanner;

import org.junit.Test;

import algorithme.backtracking.Sudoku;

public class SudokuTest {

	@Test
	public void test() {
		Scanner sc = new Scanner(new File("puzzles.sdk"));
		double start = System.currentTimeMillis();
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println("s = " + s);
			Sudoku sk = new Sudoku(s);
			sk.print();
			System.out.println();
			if (sk.solve())
				sk.print();
			else
				System.out.println("pas de solution");
			System.out.println();
		}
		sc.close();
		System.out.println((System.currentTimeMillis() - start) / 1000);
	}

}
