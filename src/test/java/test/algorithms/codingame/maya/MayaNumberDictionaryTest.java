package test.algorithms.codingame.maya;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static test.algorithms.codingame.maya.Pattern.TWELVE;
import static test.algorithms.codingame.maya.Pattern.ZERO;
import static test.algorithms.codingame.maya.Pattern.NINE;

import org.junit.Test;

import algorithms.codingame.maya.MayaNumberDictionary;

public class MayaNumberDictionaryTest {
	
	private static final int HEIGHT = 4;
	private static final int WIDTH = 4;
	private static final MayaNumberDictionary MAYA_DICTIONNARY = new DictionnaryBuilder(WIDTH, HEIGHT).with(Pattern.PATTERN_1).with(Pattern.PATTERN_2).with(Pattern.PATTERN_3).with(Pattern.PATTERN_4).build();

	@Test
	public void keyZeroOfDictionnaryShouldReturnCodeZero(){
		assertThat(MAYA_DICTIONNARY.getCode(0), equalTo(ZERO.getCode()));
	}
	
	@Test
	public void keyNineOfDictionnaryShouldReturnCodeNine(){
		assertThat(MAYA_DICTIONNARY.getCode(9), equalTo(NINE.getCode()));
	}
	
	@Test
	public void keyTwelveOfDictionnaryShouldReturnCodeTwelve(){
		assertThat(MAYA_DICTIONNARY.getCode(12), equalTo(TWELVE.getCode()));
	}
	
}
