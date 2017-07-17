package automobile;

public class Moteur {
	Roue roueGauche, roueDroite;
	String nom;

	public Moteur(String nom) {
		this.nom = nom;
		roueGauche = new Roue("roue gauche du "+nom);
		roueDroite = new Roue("roue droite du "+nom);
	}
	
	public void démarre() {
		System.out.println(nom+" a commencé à démarrer.");
		roueGauche.tourne();
		roueDroite.tourne();
		System.out.println(nom+" a terminé de démarrer.");
	}
}
