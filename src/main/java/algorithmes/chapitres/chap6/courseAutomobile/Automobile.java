package courseAutomobile;

public class Automobile {
	NombreAléatoireCourse nombreAléa;
	int positionAprès, positionAvant, vitesseMax;

	public Automobile(int vitesseMax, NombreAléatoireCourse nombreAléa) {
		this.vitesseMax = vitesseMax;
		this.nombreAléa = nombreAléa;
		positionAvant = 0;
		positionAprès = 0;
	}

	public void avance() {
		positionAvant = positionAprès;
		positionAprès = positionAprès + nombreAléa.calcule(0, vitesseMax);
	}

	public boolean aFranchiLigne(int positionLigne) {
		return positionAprès > positionLigne;
	}

	public boolean aDépassé(Automobile auto) {
		return (positionAprès > auto.positionAprès)
				&& (positionAvant <= auto.positionAvant);
	}
}
