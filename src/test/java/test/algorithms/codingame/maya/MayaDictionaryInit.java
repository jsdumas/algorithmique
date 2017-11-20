package test.algorithms.codingame.maya;

import algorithms.codingame.maya.MayaNumberDictionary;

public abstract class MayaDictionaryInit {

	protected static final int HEIGHT = 4;
	protected static final int WIDTH = 4;
	protected static final MayaNumberDictionary MAYA_DICTIONNARY = new DictionnaryBuilder(WIDTH, HEIGHT).with(Pattern.PATTERN_1).with(
			Pattern.PATTERN_2).with(Pattern.PATTERN_3).with(Pattern.PATTERN_4).build();

}
