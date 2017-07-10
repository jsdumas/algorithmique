package test.java.array.binarysearch;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import main.java.array.binarysearch.BinarySearchE;

import org.junit.Test;

public class BinarySearchETest {

	private static final Integer[] TABLEAU = { 1, 2, 3, 5, 10 };

	@Test
	public void shouldFindIndiceWhereValueIs() {
		BinarySearchE binarySearchETableau = new BinarySearchE(TABLEAU);
		assertThat(binarySearchETableau.getValueSearchedIndice(3), is(2));
		assertThat(binarySearchETableau.getValueSearchedIndice(4), is(3));
		assertThat(binarySearchETableau.getValueSearchedIndice(10), is(4));
		assertThat(binarySearchETableau.getValueSearchedIndice(11), is(5));
	}

	@Test
	public void shouldFindIndiceWhereValueShouldInsert() {
		BinarySearchE binarySearchETableau = new BinarySearchE(TABLEAU);
		assertThat(binarySearchETableau.getValueSearchedIndice(0), is(0));
		assertThat(binarySearchETableau.getValueSearchedIndice(1), is(0));
	}

}
