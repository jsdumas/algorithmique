package test.algorithms.codingame.maya;

import algorithms.codingame.maya.MayaNumberDictionary;

public class DictionnaryBuilder {

	private final int width;
	private final int height;
	private final MayaNumberDictionary mayaDictionary;

	public DictionnaryBuilder(int width, int height) {
		this.width = width;
		this.height = height;
		this.mayaDictionary = new MayaNumberDictionary(width, height);
	}

	public DictionnaryBuilder with(Pattern pattern) {
		mayaDictionary.setCode(pattern.getCode());
		return this;
	}

	public MayaNumberDictionary build() {
		return mayaDictionary;
	}

}
