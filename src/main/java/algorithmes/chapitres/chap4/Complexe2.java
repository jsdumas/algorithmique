public class Complexe2 {
	double réel, imaginaire;

	public double getRéel() {
		return réel;
	}

	public double getImaginaire() {
		return imaginaire;
	}

	public void setRéel(double réel) {
		this.réel = réel;
	}

	public void setImaginaire(double imaginaire) {
		this.imaginaire = imaginaire;
	}

	public Complexe2(double réel, double imaginaire) {
		this.réel = réel;
		this.imaginaire = imaginaire;
	}

	public double module() {
		return Math.sqrt(réel * réel + imaginaire * imaginaire);
	}

	public void ajouteRéel(double argument) {
		réel = réel + argument;
	}

	public void multiplieRéel(double argument) {
		réel = réel * argument;
		imaginaire = imaginaire * argument;
	}

	public void ajouteComplexe(Complexe2 argument) {
		réel = réel + argument.getRéel();
		imaginaire = imaginaire + argument.getImaginaire();
	}

	public void multiplieComplexe(Complexe2 argument) {
		double tempRéel;
		tempRéel = réel * argument.getRéel() - imaginaire
				* argument.getImaginaire();
		imaginaire = réel * argument.getImaginaire() + imaginaire
				* argument.getRéel();
		réel = tempRéel;
	}
}
