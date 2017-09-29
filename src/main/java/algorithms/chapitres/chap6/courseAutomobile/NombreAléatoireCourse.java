package algorithms.chapitres.chap6.courseAutomobile;

import java.util.Random;

public class NombreAl�atoireCourse {
	Random r = new Random();

	public NombreAl�atoireCourse() {
		r.setSeed(System.currentTimeMillis());
	}

	public int calcule(int borneInf, int borneSup) {
		return borneInf + (int) (r.nextDouble() * (borneSup - borneInf + 1));
	}
}
