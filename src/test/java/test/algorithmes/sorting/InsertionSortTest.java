package test.algorithmes.sorting;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import algorithmes.sorting.InsertionSort;

public class InsertionSortTest {

	private static final int LENGTH = 10;

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
	}


	private void isSorted(int[] array, boolean isSorted) {
		for(int i=0; i<array.length-1; i++){
			boolean isSmaller = array[i]<array[i+1];
			assertThat(isSmaller, is(isSorted));
			if(!isSmaller)
				break;
		}
	}

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
