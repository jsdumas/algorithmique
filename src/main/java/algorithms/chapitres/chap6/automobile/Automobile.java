package algorithms.chapitres.chap6.automobile;

public class Automobile {
	Moteur moteur;
	String nom;

	public Automobile(String nom) {
		this.nom = nom;
		moteur = new Moteur("moteur de " + nom);
	}

	public void d�marre() {
		System.out.println(nom + " a commenc� � d�marrer.");
		moteur.d�marre();
		System.out.println(nom + " a termin� de d�marrer.");
	}
}
