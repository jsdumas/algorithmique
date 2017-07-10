package test.java.array.binarysearch;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import main.java.array.binarysearch.BinarySearchE;

import org.junit.Test;

public class BinarySearchETest {

	private static final Integer[] TABLEAU = { 1, 2, 3, 5, 10 };

	@Test
	public void shouldFindANumberInArray() {
		BinarySearchE binarySearchETableau = new BinarySearchE(TABLEAU);
		assertThat(binarySearchETableau.findNumberOccurence(3), is(2));
		assertThat(binarySearchETableau.findNumberOccurence(4), is(3));
		assertThat(binarySearchETableau.findNumberOccurence(10), is(4));
		assertThat(binarySearchETableau.findNumberOccurence(11), is(5));
	}

	@Test
	public void shouldNotFindANumberInArray() {
		BinarySearchE binarySearchTableau2 = new BinarySearchE(TABLEAU);
		assertThat(binarySearchTableau2.findNumberOccurence(0), is(0));
		assertThat(binarySearchTableau2.findNumberOccurence(1), is(0));
	}

}
