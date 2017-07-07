package backtracking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sudoku {

	private final int[] grid; // 0..80 (9 * row + col)

	Sudoku() {
		this.grid = new int[81];
	}

	Sudoku(String s) {
		this.grid = new int[81];
		for (int i = 0; i < 81; i++)
			this.grid[i] = s.charAt(i) - '0';
	}

	int row(int c) {
		return c / 9;
	}

	int col(int c) {
		return c % 9;
	}

	int group(int c) {
		return 3 * (row(c) / 3) + col(c) / 3;
	}

	boolean sameZone(int c1, int c2) {
		return row(c1) == row(c2) || col(c1) == col(c2) || group(c1) == group(c2);
	}

	// vérifie que la valeur dans p est compatible avec les autres cases
	boolean check(int p) {
		for (int c = 0; c < 81; c++)
			if (c != p && sameZone(p, c) && this.grid[p] == this.grid[c])
				return false;
		return true;
	}

	// essaye de résoudre la grille courante et renvoie un booléen indiquant le succès
	boolean solve() {
		for (int c = 0; c < 81; c++)
			if (this.grid[c] == 0) {
				for (int v = 1; v < 10; v++) {
					this.grid[c] = v;
					if (check(c) && solve())
						return true;
				}
				this.grid[c] = 0;
				return false;
			}
		return true;
	}

	void print() {
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0)
				System.out.println("+---+---+---+");
			for (int j = 0; j < 9; j++) {
				if (j % 3 == 0)
					System.out.print("|");
				System.out.print(this.grid[9 * i + j]);
			}
			System.out.println("|");
		}
		System.out.println("+---+---+---+");
	}

	public static void main(String[] args) throws FileNotFoundException {
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

/*
 * expérience : maintenir la liste des cases à remplir (par ex. dans une pile) n'améliore en rien les performances
 */