package algorithmes.chapitres.chap4;

public class Complexe2 {
	double r�el, imaginaire;

	public double getR�el() {
		return r�el;
	}

	public double getImaginaire() {
		return imaginaire;
	}

	public void setR�el(double r�el) {
		this.r�el = r�el;
	}

	public void setImaginaire(double imaginaire) {
		this.imaginaire = imaginaire;
	}

	public Complexe2(double r�el, double imaginaire) {
		this.r�el = r�el;
		this.imaginaire = imaginaire;
	}

	public double module() {
		return Math.sqrt(r�el * r�el + imaginaire * imaginaire);
	}

	public void ajouteR�el(double argument) {
		r�el = r�el + argument;
	}

	public void multiplieR�el(double argument) {
		r�el = r�el * argument;
		imaginaire = imaginaire * argument;
	}

	public void ajouteComplexe(Complexe2 argument) {
		r�el = r�el + argument.getR�el();
		imaginaire = imaginaire + argument.getImaginaire();
	}

	public void multiplieComplexe(Complexe2 argument) {
		double tempR�el;
		tempR�el = r�el * argument.getR�el() - imaginaire * argument.getImaginaire();
		imaginaire = r�el * argument.getImaginaire() + imaginaire * argument.getR�el();
		r�el = tempR�el;
	}
}
