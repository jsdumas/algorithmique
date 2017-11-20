package test.algorithms.codingame.maya;

import algorithms.codingame.maya.MayaNumberDictionary;

public abstract class MayaDictionaryInit {

	protected static final int HEIGHT = 4;
	protected static final int WIDTH = 4;
	protected static final MayaNumberDictionary MAYA_DICTIONNARY = new DictionnaryBuilder(WIDTH, HEIGHT).with(Dialect.PATTERN_1).with(
			Dialect.PATTERN_2).with(Dialect.PATTERN_3).with(Dialect.PATTERN_4).build();

}
