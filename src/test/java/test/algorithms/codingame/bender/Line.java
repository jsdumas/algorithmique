package test.algorithms.codingame.bender;

public enum Line {
	
	LINE_OF_CHARPS("######"),
	LEFT_START("#@   #"),
	LINE_OF_ENDS("#$$$$#"),
	CHARP_START_END("#@$  #"),
	THREE_X("#XXXX#"),
	THREE_S("#SSSS#"),
	E_E_END("#EEE$#"),
	E_E_N("#EEEN#"),
	END_I_CHARP("#$III#"),
	END_W_W("#$WWW#"),
	CHARP_B_CHARP("#BBBB#"),
	CHARP_T_CHARP("#TTTT#");
	
	private String line;
	
	private Line(String line) {
		this.line=line;
	}
	
	public String getLine() {
		return this.line;
	}

}
