package test.algorithms.codingame.maya;

public enum Pattern {
	
	PATTERN_1 (".oo.o...oo..ooo.oooo....o...oo..ooo.oooo____o...oo..ooo.oooo____o...oo..ooo.oooo"),
	PATTERN_2 ("o..o................____________________________________________________________"),
	PATTERN_3 (".oo.........................................____________________________________"),
	PATTERN_4 ("................................................................________________"),
	ONE(".oo.o...oo..ooo."),
	THREE("ooo.oooo____o..."),
	FIVE("o...oo..ooo.oooo");
	
	private String code;

	private Pattern(String code){
		this.code = code;
	}
	
	public String getCode(){
		return code;
	}

}
