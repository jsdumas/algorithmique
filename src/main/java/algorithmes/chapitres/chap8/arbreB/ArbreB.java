package arbreB;

public class ArbreB {
	NoeudArbreB racine;
	int ordre;
	
	public ArbreB(int ordre) {
		this.ordre = ordre;
		racine = new NoeudArbreB(ordre);
	}
	
	public void insère(int nouvelleClef, String donnée) {
		Donnée nouvelleDonnée = new Donnée(nouvelleClef,donnée);
		NoeudArbreB noeudDroitNouvelleDonnée = new NoeudArbreB(ordre);
		nouvelleDonnée = racine.insère(nouvelleDonnée, noeudDroitNouvelleDonnée);
		if (nouvelleDonnée == null)
			return;
		NoeudArbreB nouvelleRacine = new NoeudArbreB(ordre);
		nouvelleRacine.données[0]=nouvelleDonnée;
		nouvelleRacine.enfants[0]=racine;
		nouvelleRacine.enfants[1]=noeudDroitNouvelleDonnée;
		nouvelleRacine.nbrDonnées = 1;
		racine = nouvelleRacine;
	}
	
	public void affiche() {
		racine.affiche(0);
	}
	
	public Donnée recherche(int clef) {
		return racine.recherche(clef);
	}
}
