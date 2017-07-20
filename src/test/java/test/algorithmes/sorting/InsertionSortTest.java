package test.algorithmes.sorting;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import algorithmes.sorting.InsertionSort;

public class InsertionSortTest {

	private static final int LENGTH = 10;

	@Test
	public void shouldInsertValueInArray() {
		// System.out.println("test de insertionSort");
		for (int len = 0; len < 10; len++)
			for (int j = 0; j <= len; j++)
				test(random_array(len));
		System.out.println("SUCCÈS");
	}

	@Test
	public void shouldNotBeSorted() {
		int[] array = initArray();
		assertThat(isSorted(array), is(false));
	}

	private boolean isSorted(int[] array) {
		for (int i = 1; i < array.length; i++)
			if (!(array[i - 1] <= array[i]))
				return false;
		return true;
	}

	private int[] occurrences(int[] a) {
		int[] occ = new int[LENGTH];
		for (int i = 0; i < a.length; i++)
			occ[a[i]]++;
		return occ;
	}

	private boolean isPermut(int[] occ1, int[] occ2) {
		for (int i = 0; i < LENGTH; i++)
			if (occ1[i] != occ2[i])
				return false;
		return true;
	}

	private String print(int[] a) {
		String s = "[";
		for (int i = 0; i < a.length; i++)
			s += (i == 0 ? "" : ", ") + a[i];
		return s + "]";
	}

	private void test(int[] tableau) {
		InsertionSort insertionSort = new InsertionSort();
		System.out.println("  test avec       a = " + print(tableau));
		int[] occ1 = occurrences(tableau);
		insertionSort.insertionSort(tableau);
		int[] occ2 = occurrences(tableau);
		System.out.println("  insertionSort(a) => a = " + print(tableau));
		if (!isSorted(tableau)) {
			System.out.println("ÉCHEC : le résultat n'est pas trié");
			System.exit(1);
		}
		if (!isPermut(occ1, occ2)) {
			System.out.println("ÉCHEC : les éléments diffèrent");
			System.exit(1);
		}
	}

	private int[] random_array(int len) {
		int[] a = new int[len];
		for (int i = 0; i < len; i++)
			a[i] = (int) (LENGTH * Math.random());
		return a;
	}

	/*****************************************/

	private int[] initArray() {
		int[] array = new int[LENGTH];
		array[0] = 10;
		array[1] = 5;
		array[2] = 7;
		array[3] = 20;
		array[4] = 19;
		array[5] = 45;
		array[6] = 3;
		array[7] = 11;
		array[8] = 188;
		array[9] = 36;
		return array;
	}

}
