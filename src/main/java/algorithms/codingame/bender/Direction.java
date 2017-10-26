package algorithms.codingame.bender;

public enum Direction {
	
	SOUTH("SOUTH"),
	EAST("EAST"),
	NORTH("NORTH"),
	WEST("WEST"),
	LOOP("LOOP");
	
	private String direction;

	private Direction(String direction) {
		this.direction = direction;
	}

}
