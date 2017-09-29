package algorithms.chapitres.chap8.listechaineetablehachage;

public class Donnée {
	public int clef;
	public String valeur;

	public Donnée(int clef, String valeur) {
		this.clef = clef;
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return clef + " " + valeur;
	}
}
