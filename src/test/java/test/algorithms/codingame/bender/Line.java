package test.algorithms.codingame.bender;

public enum Line {
	
	CHARP_START_CHARP("#@#"),
	CHARP_START_END("#@$"),
	THREE_CHARPS("###"),
	THREE_ENDS("$$$"),
	THREE_X("XXX"),
	THREE_S("SSS"),
	E_E_END("EE$"),
	E_E_N("EEN"),
	END_I_CHARP("$I#"),
	END_W_W("$WW"),
	CHARP_B_CHARP("#B#");
	
	private String line;
	
	private Line(String line) {
		this.line=line;
	}
	
	public String getLine() {
		return this.line;
	}

}
