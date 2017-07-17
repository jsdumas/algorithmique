package designpatterns.practice.treeptik.initobjet;

public class Chevalier extends Personnage {

	private static final long serialVersionUID = 1L;

	public Chevalier() {
		// TODO Auto-generated constructor stub
		this.nom = "chevalier1";
	}

	@Override
	public void avancer() {
		// TODO Auto-generated method stub
		System.out.println("Chevalier avancer");
	}

	public void avancer(int val) {
		// TODO Auto-generated method stub
		System.out.println("Chevalier avancer de " + val + " pas");
	}
}
