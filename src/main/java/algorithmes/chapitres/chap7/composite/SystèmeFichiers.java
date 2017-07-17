package algorithmes.chapitres.chap7.composite;

public class SystèmeFichiers {

	public static void main(String[] args) {
		Répertoire système = new Répertoire();
		Répertoire répertoire1 = new Répertoire();
		Répertoire répertoire2 = new Répertoire();
		répertoire1.ajouteNoeud(new Fichier());
		répertoire1.ajouteNoeud(new Fichier());
		répertoire2.ajouteNoeud(new Fichier());
		répertoire2.ajouteNoeud(new Fichier());
		répertoire2.ajouteNoeud(new Fichier());
		système.ajouteNoeud(répertoire1);
		système.ajouteNoeud(répertoire2);
		système.ajouteNoeud(new Fichier());
		System.out.println(" Nombre de fichiers dans le système : " + système.nombreFichiers());
		System.out.println(" Nombre de répertoire dans le système : " + système.nombreRépertoires());
	}
}
