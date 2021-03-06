package test.algorithms.practice.sorting;

import org.junit.Test;

import algorithms.practice.sorting.HeapSort;

public class HeapSortTest extends ArrayTest {

	@Test
	public void shouldNotBeSorted() {
		isSorted(super.array, false);
	}

	@Test
	public void shouldBeSorted() {
		int[] array = super.array;
		HeapSort heapSort = new HeapSort();
		heapSort.heapSort(array);
		isSorted(array, true);
		System.out.print(heapSort.getTimeExec());
	}

}
