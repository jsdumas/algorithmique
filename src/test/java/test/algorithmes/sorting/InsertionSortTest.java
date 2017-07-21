package test.algorithmes.sorting;

import org.junit.Test;

import algorithmes.sorting.InsertionSort;

public class InsertionSortTest extends ArrayTest {

	@Test
	public void shouldNotBeSorted() {
		isSorted(initArray(), false);
	}

	@Test
	public void shouldBeSorted() {
		int[] array = initArray();
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertionSort(array);
		isSorted(array, true);
		System.out.print(insertionSort.getTimeExec());
	}

}
