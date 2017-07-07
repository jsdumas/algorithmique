package test.array.binarysearch;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import array.binarysearch.BinarySearch;

public class BinarySearchTest {

	private static final int[] TABLEAU_1 = { 1, 2, 3, 5, 10 };
	private static final int[] TABLEAU_2 = { 1, 2, 3, 5, 10 };

	@Test
	public void shouldFindValueInArray() {
		BinarySearch binarySearchTableau1 = new BinarySearch(TABLEAU_1);
		assertThat(binarySearchTableau1.isValueFinded(1), is(true));
		assertThat(binarySearchTableau1.isValueFinded(3), is(true));
		assertThat(binarySearchTableau1.isValueFinded(10), is(true));
	}

	@Test
	public void shouldNotFindValueInArray() {
		BinarySearch binarySearch = new BinarySearch(TABLEAU_1);
		assertThat(binarySearch.isValueFinded(0), is(false));
		assertThat(binarySearch.isValueFinded(4), is(false));
		assertThat(binarySearch.isValueFinded(11), is(false));
	}

	@Test
	public void shouldFindANumberInArray() {
		BinarySearch binarySearchTableau2 = new BinarySearch(TABLEAU_2);
		assertThat(binarySearchTableau2.findNumberOccurence(3), is(2));
		assertThat(binarySearchTableau2.findNumberOccurence(4), is(3));
		assertThat(binarySearchTableau2.findNumberOccurence(10), is(4));
		assertThat(binarySearchTableau2.findNumberOccurence(11), is(5));
	}

	@Test
	public void shouldNotFindANumberInArray() {
		BinarySearch binarySearchTableau2 = new BinarySearch(TABLEAU_2);
		assertThat(binarySearchTableau2.findNumberOccurence(0), is(0));
		assertThat(binarySearchTableau2.findNumberOccurence(1), is(0));
	}

}
