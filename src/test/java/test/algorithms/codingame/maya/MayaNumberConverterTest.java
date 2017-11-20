package test.algorithms.codingame.maya;

import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import algorithms.codingame.maya.MayaNumber;
import algorithms.codingame.maya.MayaNumberConverter;

public class MayaNumberConverterTest extends MayaDictionaryInit {

	private static final int LINE_NUMBER = 4;
	private static final Long ONE = 1L;
	private static final MayaNumber MAYA_NUMBER = new MayaNumberBuilder(LINE_NUMBER).width(Number.LINE_1).width(Number.LINE_2).width(
			Number.LINE_2).width(Number.LINE_2).build();
	private static final MayaNumberConverter MAYA_NUMBER_CONVERTER = new MayaNumberConverter(MAYA_DICTIONNARY);

	@Test
	public void whenMayaNumberIsOneThenItShouldRetrurnOne() {
		MatcherAssert.assertThat(MAYA_NUMBER_CONVERTER.getMayaNumberTranslated(MAYA_NUMBER), equalTo(ONE));
	}

}
