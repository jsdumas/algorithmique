package test.algorithms.codingame.maya;

public enum Number {

	LINE_1("o..."), //
	LINE_2("...."); //

	private String line;

	private Number(String line) {
		this.line = line;
	}

	public String getLine() {
		return this.line;
	}

}
