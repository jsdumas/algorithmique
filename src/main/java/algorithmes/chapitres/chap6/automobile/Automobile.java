package algorithmes.chapitres.chap6.automobile;

public class Automobile {
	Moteur moteur;
	String nom;

	public Automobile(String nom) {
		this.nom = nom;
		moteur = new Moteur("moteur de " + nom);
	}

	public void démarre() {
		System.out.println(nom + " a commencé à démarrer.");
		moteur.démarre();
		System.out.println(nom + " a terminé de démarrer.");
	}
}
