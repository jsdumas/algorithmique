package test.algorithms.codingame.bender;

import algorithms.codingame.bender.Bender;
import algorithms.codingame.bender.BenderBuilder;
import algorithms.codingame.bender.MemorisePath;

public class PathFinderFactory {
	
	private static final String LINE_START = "#@#";
	private static final String LINE_START_END = "#@$";
	private static final String LINE_CHARP = "###";
	private static final String LINE_DOLLAR = "$$$";
	private static final String LINE_X = "XXX";
	private static final String LINE_S = "SSS";
	private static final String LINE_E = "EE$";
	private static final String LINE_EEN = "EEN";
	private static final String LINE_I = "$I#";
	private static final String LINE_W = "$WW";
	private static final String LINE_B = "#B#";
	private static final Bender BENDER_WALK_TO_SOUTH_FROM_START = new BenderBuilder(2,3).withLine(0, LINE_START).withLine(1, LINE_DOLLAR).build();
	private static final Bender BENDER_LOOP_WALK_BECAUSE_OF_CHARP = new BenderBuilder(3,3).withLine(0, LINE_CHARP).withLine(1, LINE_START).withLine(2, LINE_CHARP).build();
	private static final Bender BENDER_LOOP_WALK_BECAUSE_OF_X = new BenderBuilder(3,3).withLine(0, LINE_CHARP).withLine(1, LINE_START).withLine(2, LINE_X).build();
	private static final Bender BENDER_WALK_TO_SOUTH_FROM_S_MODIFIER = new BenderBuilder(3,3).withLine(0, LINE_START).withLine(1, LINE_S).withLine(2, LINE_DOLLAR).build();
	private static final Bender BENDER_WALK_TO_EAST_FROM_E_MODIFIER = new BenderBuilder(2,3).withLine(0, LINE_START).withLine(1, LINE_E).build();
	private static final Bender BENDER_WALK_TO_NORTH_FROM_N_MODIFIER = new BenderBuilder(2,3).withLine(0, LINE_START_END).withLine(1, LINE_EEN).build();
	private static final Bender BENDER_WALK_TO_WEST_FROM_W_MODIFIER = new BenderBuilder(2,3).withLine(0, LINE_START).withLine(1, LINE_W).build();
	private static final Bender BENDER_WALK_TO_WEST_FROM_INVERSOR = new BenderBuilder(3,3).withLine(0, LINE_START).withLine(1, LINE_I).withLine(2, LINE_CHARP).build();
	private static final Bender BENDER_WALK_TO_SOUTH_FROM_BIER = new BenderBuilder(5,3).withLine(0, LINE_CHARP).withLine(1, LINE_START).withLine(2, LINE_B).withLine(3, LINE_X).withLine(4, LINE_DOLLAR).build();
	
	
	
	public MemorisePath getPath(Path path) {
		MemorisePath memorisePath;
		switch(path) {
		case TO_SOUTH_FROM_START :
			memorisePath = BENDER_WALK_TO_SOUTH_FROM_START.getMemorisePath();
			break;
		case LOOP_BECAUSE_OF_CHARP :
			memorisePath = BENDER_LOOP_WALK_BECAUSE_OF_CHARP.getMemorisePath();
			break;
		case LOOP_BECAUSE_OF_X :
			memorisePath = BENDER_LOOP_WALK_BECAUSE_OF_X.getMemorisePath();
			break;
		case TO_SOUTH_FROM_S_MODIFIER :
			memorisePath = BENDER_WALK_TO_SOUTH_FROM_S_MODIFIER.getMemorisePath();
			break;
		case TO_EAST_FROM_E_MODIFIER :
			memorisePath = BENDER_WALK_TO_EAST_FROM_E_MODIFIER.getMemorisePath();
			break;
		case TO_NORTH_FROM_N_MODIFIER :
			memorisePath = BENDER_WALK_TO_NORTH_FROM_N_MODIFIER.getMemorisePath();
			break;
		case TO_WEST_FROM_W_MODIFIER :
			memorisePath = BENDER_WALK_TO_WEST_FROM_W_MODIFIER.getMemorisePath();
			break;
		case TO_WEST_FROM_INVERSOR :
			memorisePath = BENDER_WALK_TO_WEST_FROM_INVERSOR.getMemorisePath();
			break;
		case TO_SOUTH_FROM_BIER :
			memorisePath = BENDER_WALK_TO_SOUTH_FROM_BIER.getMemorisePath();
			break;
		default:
			memorisePath = null;
			break;
		}
			
		return memorisePath;
	}

	
	
	
}
