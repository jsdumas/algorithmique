package test.algorithmes.sorting;

import org.junit.Test;

import algorithmes.sorting.MergeSort;

public class MergeSortTest extends ArrayTest {

	@Test
	public void shouldNotBeSorted() {
		isSorted(super.array, false);
	}

	@Test
	public void shouldBeSorted() {
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergesort(array);
		isSorted(super.array, true);
		System.out.print(mergeSort.getTimeExec());
	}

}
