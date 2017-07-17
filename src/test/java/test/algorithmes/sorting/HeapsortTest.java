package test.algorithmes.sorting;

import algorithmes.sorting.Heapsort;

public class HeapsortTest {

	static boolean is_sorted(int[] a) {
		for (int i = 1; i < a.length; i++)
			if (!(a[i - 1] <= a[i]))
				return false;
		return true;
	}

	static final int M = 10; // les �l�ments sont dans 0..M-1

	static int[] occurrences(int[] a) {
		int[] occ = new int[M];
		for (int i = 0; i < a.length; i++)
			occ[a[i]]++;
		return occ;
	}

	static boolean is_permut(int[] occ1, int[] occ2) {
		for (int i = 0; i < M; i++)
			if (occ1[i] != occ2[i])
				return false;
		return true;
	}

	static String print(int[] a) {
		String s = "[";
		for (int i = 0; i < a.length; i++)
			s += (i == 0 ? "" : ", ") + a[i];
		return s + "]";
	}

	static int[] random_array(int len) {
		int[] a = new int[len];
		for (int i = 0; i < len; i++)
			a[i] = (int) (M * Math.random());
		return a;
	}

	static void test(int[] a) {
		System.out.println("  test avec       a = " + print(a));
		int[] occ1 = occurrences(a);
		Heapsort.heapsort(a);
		int[] occ2 = occurrences(a);
		System.out.println("  heapsort(a) => a = " + print(a));
		if (!is_sorted(a)) {
			System.out.println("�CHEC : le r�sultat n'est pas tri�");
			System.exit(1);
		}
		if (!is_permut(occ1, occ2)) {
			System.out.println("�CHEC : les �l�ments diff�rent");
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		System.out.println("test de mergesort");
		for (int len = 0; len < 10; len++)
			for (int j = 0; j <= len; j++)
				test(random_array(len));
		System.out.println("SUCC�S TestHeapsort");
	}

}
