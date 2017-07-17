package algorithmes.chapitres.chap6.automobile;

public class Moteur {
	Roue roueGauche, roueDroite;
	String nom;

	public Moteur(String nom) {
		this.nom = nom;
		roueGauche = new Roue("roue gauche du " + nom);
		roueDroite = new Roue("roue droite du " + nom);
	}

	public void d�marre() {
		System.out.println(nom + " a commenc� � d�marrer.");
		roueGauche.tourne();
		roueDroite.tourne();
		System.out.println(nom + " a termin� de d�marrer.");
	}
}
