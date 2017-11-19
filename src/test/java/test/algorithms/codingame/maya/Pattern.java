package test.algorithms.codingame.maya;

public enum Pattern {
	
	PATTERN_1 (".oo.o...oo..ooo.oooo....o...oo..ooo.oooo____o...oo..ooo.oooo____o...oo..ooo.oooo"),
	PATTERN_2 ("o..o................____________________________________________________________"),
	PATTERN_3 (".oo.........................................____________________________________"),
	PATTERN_4 ("................................................................________________"),
	ZERO(".oo.o..o.oo....."),
	NINE("oooo____........"),
	TWELVE("oo..________...."),
	HEIGHTEEN("ooo.________________________");
	
	private String code;

	private Pattern(String code){
		this.code = code;
	}
	
	public String getCode(){
		return code;
	}

}
