package test.algorithmes.sorting;

import org.junit.Test;

import algorithmes.sorting.InsertionSort;

public class InsertionSortTest extends ArrayTest {

	@Test
	public void shouldNotBeSorted() {
		isSorted(super.array, false);
	}

	@Test
	public void shouldBeSorted() {
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertionSort(array);
		isSorted(super.array, true);
		System.out.print(insertionSort.getTimeExec());
	}

}
