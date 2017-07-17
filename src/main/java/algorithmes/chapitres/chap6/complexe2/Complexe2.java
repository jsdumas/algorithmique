package algorithmes.chapitres.chap6.complexe2;

public class Complexe2 extends Complexe {
	public Complexe2(double réel, double imaginaire) {
		super(réel, imaginaire);
	}

	public void ajouteComplexe(Complexe argument) {
		réel = réel + argument.getRéel();
		imaginaire = imaginaire + argument.getImaginaire();
	}

	public void multiplieComplexe(Complexe argument) {
		double tempRéel;
		tempRéel = réel * argument.getRéel() - imaginaire * argument.getImaginaire();
		imaginaire = réel * argument.getImaginaire() + imaginaire * argument.getRéel();
		réel = tempRéel;
	}
}
