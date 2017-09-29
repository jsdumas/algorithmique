package algorithms.chapitres.chap6.courseAutomobile;

import java.util.Random;

public class NombreAléatoireCourse {
	Random r = new Random();

	public NombreAléatoireCourse() {
		r.setSeed(System.currentTimeMillis());
	}

	public int calcule(int borneInf, int borneSup) {
		return borneInf + (int) (r.nextDouble() * (borneSup - borneInf + 1));
	}
}
