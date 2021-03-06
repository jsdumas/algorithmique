package test.algorithms.practice.sorting;

import org.junit.Test;

import algorithms.practice.sorting.QuickSort;

public class QuickSortTest extends ArrayTest {

	@Test
	public void shouldNotBeSorted() {
		isSorted(super.array, false);
	}

	@Test
	public void shouldBeSorted() {
		QuickSort quickSort = new QuickSort();
		quickSort.quicksort(array);
		isSorted(super.array, true);
		System.out.print(quickSort.getTimeExec());
	}

}
