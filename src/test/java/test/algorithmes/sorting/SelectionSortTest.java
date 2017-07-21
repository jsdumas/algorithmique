package test.algorithmes.sorting;

import org.junit.Test;

import algorithmes.sorting.SelectionSort;

public class SelectionSortTest extends ArrayTest {

	@Test
	public void shouldNotBeSorted() {
		isSorted(initArray(), false);
	}

	@Test
	public void shouldBeSorted() {
		int[] array = initArray();
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.triSelection(array);
		isSorted(array, true);
		System.out.print(selectionSort.getTimeExec());
	}

}
