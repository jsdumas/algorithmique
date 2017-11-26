package test.algorithms.codingame.maya;

import algorithms.codingame.maya.MayaNumber;

public class MayaNumberBuilder {

	private final MayaNumber mayaNumber;

	public MayaNumberBuilder(int lineNumber) {
		this.mayaNumber = new MayaNumber(lineNumber);
	}

	public MayaNumberBuilder width(Number line) {
		mayaNumber.addLine(line.getLine());
		return this;
	}

	public MayaNumber build() {
		return mayaNumber;
	}

}
