package algorithms.chapitres.chap6.complexe2;

public class Complexe2 extends Complexe {
	public Complexe2(double r�el, double imaginaire) {
		super(r�el, imaginaire);
	}

	public void ajouteComplexe(Complexe argument) {
		r�el = r�el + argument.getR�el();
		imaginaire = imaginaire + argument.getImaginaire();
	}

	public void multiplieComplexe(Complexe argument) {
		double tempR�el;
		tempR�el = r�el * argument.getR�el() - imaginaire * argument.getImaginaire();
		imaginaire = r�el * argument.getImaginaire() + imaginaire * argument.getR�el();
		r�el = tempR�el;
	}
}
