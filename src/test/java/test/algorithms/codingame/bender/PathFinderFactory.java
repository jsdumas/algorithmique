package test.algorithms.codingame.bender;

import static test.algorithms.codingame.bender.Line.CHARP_B_CHARP;
import static test.algorithms.codingame.bender.Line.LINE_OF_CHARPS;
import static test.algorithms.codingame.bender.Line.LINE_OF_ENDS;
import static test.algorithms.codingame.bender.Line.E_E_END;
import static test.algorithms.codingame.bender.Line.E_E_N;
import static test.algorithms.codingame.bender.Line.END_I_CHARP;
import static test.algorithms.codingame.bender.Line.THREE_S;
import static test.algorithms.codingame.bender.Line.LEFT_START;
import static test.algorithms.codingame.bender.Line.CHARP_START_END;
import static test.algorithms.codingame.bender.Line.CHARP_T_CHARP;
import static test.algorithms.codingame.bender.Line.END_W_W;
import static test.algorithms.codingame.bender.Line.THREE_X;

import algorithms.codingame.bender.Bender;
import algorithms.codingame.bender.BenderBuilder;
import algorithms.codingame.bender.MemorisePath;

public class PathFinderFactory {
	
	private static final Bender BENDER_WALK_TO_SOUTH_FROM_START = new BenderBuilder(2,6).withLine(0, LEFT_START.getLine()).withLine(1, LINE_OF_ENDS.getLine()).build();
	private static final Bender BENDER_LOOP_WALK_BECAUSE_OF_CHARP = new BenderBuilder(3,6).withLine(0, LINE_OF_CHARPS.getLine()).withLine(1, LEFT_START.getLine()).withLine(2, LINE_OF_CHARPS.getLine()).build();
//	private static final Bender BENDER_LOOP_WALK_BECAUSE_OF_X = new BenderBuilder(3,6).withLine(0, LINE_OF_CHARPS.getLine()).withLine(1, LEFT_START.getLine()).withLine(2, THREE_X.getLine()).build();
//	private static final Bender BENDER_WALK_TO_SOUTH_FROM_S_MODIFIER = new BenderBuilder(3,6).withLine(0, LEFT_START.getLine()).withLine(1, THREE_S.getLine()).withLine(2, THREE_ENDS.getLine()).build();
//	private static final Bender BENDER_WALK_TO_EAST_FROM_E_MODIFIER = new BenderBuilder(2,6).withLine(0, LEFT_START.getLine()).withLine(1, E_E_END.getLine()).build();
//	private static final Bender BENDER_WALK_TO_NORTH_FROM_N_MODIFIER = new BenderBuilder(2,6).withLine(0, CHARP_START_END.getLine()).withLine(1, E_E_N.getLine()).build();
//	private static final Bender BENDER_WALK_TO_WEST_FROM_W_MODIFIER = new BenderBuilder(2,6).withLine(0, LEFT_START.getLine()).withLine(1, END_W_W.getLine()).build();
//	private static final Bender BENDER_WALK_TO_WEST_FROM_INVERSOR = new BenderBuilder(3,6).withLine(0, LEFT_START.getLine()).withLine(1, END_I_CHARP.getLine()).withLine(2, LINE_OF_CHARPS.getLine()).build();
//	private static final Bender BENDER_WALK_TO_SOUTH_FROM_BIER = new BenderBuilder(5,6).withLine(0, LINE_OF_CHARPS.getLine()).withLine(1, LEFT_START.getLine()).withLine(2, CHARP_B_CHARP.getLine()).withLine(3, THREE_X.getLine()).withLine(4, THREE_ENDS.getLine()).build();
//	private static final Bender BENDER_WALK_TO_SOUTH_FROM_T = new BenderBuilder(5,6).withLine(0, LEFT_START.getLine()).withLine(1, CHARP_T_CHARP.getLine()).withLine(2, LINE_OF_CHARPS.getLine()).withLine(3, CHARP_T_CHARP.getLine()).withLine(4, THREE_ENDS.getLine()).build();
//	
	
	public MemorisePath getPath(Path path) {
		MemorisePath memorisePath;
		switch(path) {
		case TO_SOUTH_FROM_START :
			memorisePath = BENDER_WALK_TO_SOUTH_FROM_START.getMemorisePath();
			break;
		case LOOP_BECAUSE_OF_CHARP :
			memorisePath = BENDER_LOOP_WALK_BECAUSE_OF_CHARP.getMemorisePath();
			break;
//		case LOOP_BECAUSE_OF_X :
//			memorisePath = BENDER_LOOP_WALK_BECAUSE_OF_X.getMemorisePath();
//			break;
//		case TO_SOUTH_FROM_S_MODIFIER :
//			memorisePath = BENDER_WALK_TO_SOUTH_FROM_S_MODIFIER.getMemorisePath();
//			break;
//		case TO_EAST_FROM_E_MODIFIER :
//			memorisePath = BENDER_WALK_TO_EAST_FROM_E_MODIFIER.getMemorisePath();
//			break;
//		case TO_NORTH_FROM_N_MODIFIER :
//			memorisePath = BENDER_WALK_TO_NORTH_FROM_N_MODIFIER.getMemorisePath();
//			break;
//		case TO_WEST_FROM_W_MODIFIER :
//			memorisePath = BENDER_WALK_TO_WEST_FROM_W_MODIFIER.getMemorisePath();
//			break;
//		case TO_WEST_FROM_INVERSOR :
//			memorisePath = BENDER_WALK_TO_WEST_FROM_INVERSOR.getMemorisePath();
//			break;
//		case TO_SOUTH_FROM_BIER :
//			memorisePath = BENDER_WALK_TO_SOUTH_FROM_BIER.getMemorisePath();
//			break;
//		case TO_SOUTH_FROM_T :
//			memorisePath = BENDER_WALK_TO_SOUTH_FROM_T.getMemorisePath();
//			break;
		default:
			memorisePath = null;
			break;
		}
			
		return memorisePath;
	}

	
	
	
}
