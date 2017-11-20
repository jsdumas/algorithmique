package test.algorithms.codingame.maya;

import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import algorithms.codingame.maya.MayaNumber;
import algorithms.codingame.maya.MayaNumberConverter;

public class MayaNumberConverterTest extends MayaDictionaryInit {

	
	private static final Long ONE = 1L;

	@Test
	public void whenMayaNumberIsOneThenItShouldRetrurnOne() {
		MatcherAssert.assertThat(MAYA_NUMBER_CONVERTER.getMayaNumberTranslated(MAYA_NUMBER_ONE), equalTo(ONE));
	}
	
	@Test
	public void whenMayaNumberIsQuatreMilleHuitCentCinqOneThenItShouldRetrurnFourThousandEightHundredAndFive() {
		MatcherAssert.assertThat(MAYA_NUMBER_CONVERTER.getMayaNumberTranslated(MAYA_NUMBER_FOUR_THOUSAND_EIGHT_HUNDRED_AND_FIVE), equalTo(FOUR_THOUSAND_EIGHT_HUNDRED_AND_FIVE));
	}

}
