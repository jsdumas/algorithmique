package test.algorithms.codingame.maya;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static test.algorithms.codingame.maya.MayaDictionaryInit.MAYA_DICTIONNARY;
import static test.algorithms.codingame.maya.Pattern.NINE;
import static test.algorithms.codingame.maya.Pattern.TWELVE;
import static test.algorithms.codingame.maya.Pattern.ZERO;

import org.junit.Test;

public class MayaNumberDictionaryTest extends MayaDictionaryInit {

	@Test
	public void keyZeroOfDictionnaryShouldReturnCodeZero() {
		assertThat(MAYA_DICTIONNARY.getCode(0), equalTo(ZERO.getCode()));
	}

	@Test
	public void keyNineOfDictionnaryShouldReturnCodeNine() {
		assertThat(MAYA_DICTIONNARY.getCode(9), equalTo(NINE.getCode()));
	}

	@Test
	public void keyTwelveOfDictionnaryShouldReturnCodeTwelve() {
		assertThat(MAYA_DICTIONNARY.getCode(12), equalTo(TWELVE.getCode()));
	}

}
