package test.algorithmes.sorting;

import org.junit.Test;

import algorithmes.sorting.BubbleSort;

public class BubbleSortTest extends ArrayTest {

	@Test
	public void shouldNotBeSorted() {
		isSorted(initArray(), false);
	}

	@Test
	public void shouldBeSorted() {
		int[] array = initArray();
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(array);
		isSorted(array, true);
		System.out.print(bubbleSort.getTimeExec());
	}

	@Test
	public void shouldBeSortedWithWhile() {
		int[] array = initArray();
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSortWhile(array);
		isSorted(array, true);
		System.out.print(bubbleSort.getTimeExec());
	}

}
