package test.algorithms.codingame.maya;

public enum Number {

	LINE_ONE_O_THREE_POINTS("o..."), //
	LINE_TWO_O_TWO_POINTS("oo.."), //
	LINE_ONE_POINT_TWO_O_ONE_POINT(".oo."), //
	LINE_ONE_O_TWO_POINTS_ONE_POINT("o..o"), //
	LINE_POINT("...."),
	LINE_DASH("____"); //

	private String line;

	private Number(String line) {
		this.line = line;
	}

	public String getLine() {
		return this.line;
	}

}
