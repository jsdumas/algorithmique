package test.algorithms.practice.sorting;

import org.junit.Test;

import algorithms.practice.sorting.MergeSort;

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
