package test.algorithms.codingame.maya;

import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import algorithms.codingame.maya.MayaNumber;
import algorithms.codingame.maya.MayaNumberConverter;

public class MayaNumberConverterTest extends MayaDictionaryInit {

	private static final int LINE_NUMBER = 4;
	private static final Long ONE = 1L;
	private static final Long QUATRE_MILLE_HUIT_CENT_CINQ = 4805L;
	private static final MayaNumber MAYA_NUMBER_ONE = new MayaNumberBuilder(LINE_NUMBER).width(Number.LINE_ONE_O_THREE_POINTS).width(Number.LINE_POINT).width(
			Number.LINE_POINT).width(Number.LINE_POINT).build();
	private static final MayaNumber MAYA_NUMBER_QUATRE_MILLE_HUIT_CENT_CINQ = new MayaNumberBuilder(LINE_NUMBER)//
			.width(Number.LINE_TWO_O_TWO_POINTS).width(Number.LINE_DASH).width(Number.LINE_DASH).width(Number.LINE_POINT)//
			.width(Number.LINE_ONE_POINT_TWO_O_ONE_POINT).width(Number.LINE_ONE_O_TWO_POINTS_ONE_POINT).width(Number.LINE_ONE_POINT_TWO_O_ONE_POINT).width(Number.LINE_POINT)//
			.width(Number.LINE_POINT).width(Number.LINE_DASH).width(Number.LINE_POINT).width(Number.LINE_POINT)//
			.build();
	private static final MayaNumberConverter MAYA_NUMBER_CONVERTER = new MayaNumberConverter(MAYA_DICTIONNARY);

	@Test
	public void whenMayaNumberIsOneThenItShouldRetrurnOne() {
		MatcherAssert.assertThat(MAYA_NUMBER_CONVERTER.getMayaNumberTranslated(MAYA_NUMBER_ONE), equalTo(ONE));
	}
	
	@Test
	public void whenMayaNumberIsQuatreMilleHuitCentCinqOneThenItShouldRetrurnQuatreMilleHuitCentCinq() {
		MatcherAssert.assertThat(MAYA_NUMBER_CONVERTER.getMayaNumberTranslated(MAYA_NUMBER_QUATRE_MILLE_HUIT_CENT_CINQ), equalTo(QUATRE_MILLE_HUIT_CENT_CINQ));
	}

}
