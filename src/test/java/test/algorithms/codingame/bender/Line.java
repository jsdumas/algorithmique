package test.algorithms.codingame.bender;

public enum Line {
	
	LINE_OF_CHARPS("######"),
	AT_AND_THREE_SPACES("#@   #"),
	ONE_SPACE_AND_AT_AND_TWO_SPACES("# @  #"),
	AT_AND_DOLLARD("#@$  #"),
	LINE_OF_DOLLARDS("#$$$$#"),
	LINE_OF_X("#XXXX#"),
	LINE_OF_S("#SSSS#"),
	E_AND_ONE_DOLLARD("#E$XX#"),
	E_AND_ONE_NORTH_TWO_SPACES("#EN  #"),
	DOLLARD_AND_ONE_I_AND_TWO_X("#$IXX#"),
	DOLLARD_AND_THREE_W("#$WWW#"),
	LINE_OF_B("#BBBB#"),
	ONE_T_AND_THREE_X("#TXXX#");
	
	private String line;
	
	private Line(String line) {
		this.line=line;
	}
	
	public String getLine() {
		return this.line;
	}

}
