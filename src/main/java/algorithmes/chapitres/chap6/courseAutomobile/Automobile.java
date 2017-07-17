package algorithmes.chapitres.chap6.courseAutomobile;

public class Automobile {
	NombreAl�atoireCourse nombreAl�a;
	int positionApr�s, positionAvant, vitesseMax;

	public Automobile(int vitesseMax, NombreAl�atoireCourse nombreAl�a) {
		this.vitesseMax = vitesseMax;
		this.nombreAl�a = nombreAl�a;
		positionAvant = 0;
		positionApr�s = 0;
	}

	public void avance() {
		positionAvant = positionApr�s;
		positionApr�s = positionApr�s + nombreAl�a.calcule(0, vitesseMax);
	}

	public boolean aFranchiLigne(int positionLigne) {
		return positionApr�s > positionLigne;
	}

	public boolean aD�pass�(Automobile auto) {
		return (positionApr�s > auto.positionApr�s) && (positionAvant <= auto.positionAvant);
	}
}
