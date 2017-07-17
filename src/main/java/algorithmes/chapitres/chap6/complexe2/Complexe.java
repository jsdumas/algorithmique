package complexe2;

public class Complexe {
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

	public Complexe(double r�el, double imaginaire) {
		this.r�el = r�el;
		this.imaginaire = imaginaire;
	}
	
	public double module() {
		return Math.sqrt(r�el*r�el+imaginaire*imaginaire);
	}
	
	public void ajouteR�el(double argument) {
		r�el = r�el + argument;
	}
	
	public void multiplieR�el(double argument) {
		r�el = r�el * argument;
		imaginaire = imaginaire * argument;
	}
	
	public String toString() {
		return "partie r�elle : "+r�el+" partie imaginaire : "+imaginaire;
	}
}
