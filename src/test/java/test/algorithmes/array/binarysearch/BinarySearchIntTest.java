package test.algorithme.array.binarysearch;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import algorithme.array.binarysearch.BinarySearchInt;

public class BinarySearchIntTest {

	private static final int[] TABLEAU_1 = { 1, 2, 3, 5, 10 };

	@Test
	public void shouldFindValueInArray() {
		BinarySearchInt binarySearchTableau1 = new BinarySearchInt(TABLEAU_1);
		assertThat(binarySearchTableau1.isValueFinded(1), is(true));
		assertThat(binarySearchTableau1.isValueFinded(3), is(true));
		assertThat(binarySearchTableau1.isValueFinded(10), is(true));
	}

	@Test
	public void shouldNotFindValueInArray() {
		BinarySearchInt binarySearch = new BinarySearchInt(TABLEAU_1);
		assertThat(binarySearch.isValueFinded(0), is(false));
		assertThat(binarySearch.isValueFinded(4), is(false));
		assertThat(binarySearch.isValueFinded(11), is(false));
	}

}
