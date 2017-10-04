package designpatterns.initobjet;

public class Chevalier extends Personnage {

	private static final long serialVersionUID = 1L;

	public Chevalier() {
		this.nom = "chevalier1";
	}

	@Override
	public void avancer() {
		System.out.println("Chevalier avancer");
	}

	public void avancer(int val) {
		System.out.println("Chevalier avancer de " + val + " pas");
	}
}
