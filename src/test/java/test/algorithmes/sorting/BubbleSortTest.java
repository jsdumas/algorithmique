package test.algorithmes.sorting;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Random;

import org.junit.Test;

import algorithmes.sorting.BubbleSort;

public class BubbleSortTest {

	private static final int LENGTH = 30000;

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
	}

	private void isSorted(int[] array, boolean isSorted) {
		for (int i = 0; i < array.length - 1; i++) {
			boolean isSmaller = array[i] <= array[i + 1];
			assertThat(isSmaller, is(isSorted));
			if (!isSmaller)
				break;
		}
	}

	private int[] initArray() {
		Random random = new Random();
		int[] array = new int[LENGTH];
		for (int i = 0; i < LENGTH; i++)
			array[i] = random.nextInt(100);
		return array;
	}

}
