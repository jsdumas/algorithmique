package test.algorithms.codingame.maya;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static test.algorithms.codingame.maya.Pattern.FIVE;
import static test.algorithms.codingame.maya.Pattern.ONE;
import static test.algorithms.codingame.maya.Pattern.THREE;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import algorithms.codingame.maya.MayaNumberDictionary;

public class MayaNumberDictionaryTest {
	
	private static final int HEIGHT = 4;
	private static final int WIDTH = 4;
	private static final MayaNumberDictionary MAYA_DICTIONNARY = new DictionnaryBuilder(WIDTH, HEIGHT).with(Pattern.PATTERN_1).with(Pattern.PATTERN_2).with(Pattern.PATTERN_3).with(Pattern.PATTERN_4).build();

	@Test
	public void keyOneOfDictionnaryShouldReturnCodeOne(){
		assertThat(MAYA_DICTIONNARY.getCode(1), equalTo(ONE.getCode()));
	}
	
	@Test
	public void keyThreeOfDictionnaryShouldReturnCodeThree(){
		assertThat(MAYA_DICTIONNARY.getCode(3), equalTo(THREE.getCode()));
	}
	
	@Test
	public void keyFiveOfDictionnaryShouldReturnCodeFive(){
		assertThat(MAYA_DICTIONNARY.getCode(5), equalTo(FIVE.getCode()));
	}
	
}
