package algorithmes.chapitres.chap8.arbreb;

public class Donn�e {
	public int clef;
	public String valeur;

	public Donn�e(int clef, String valeur) {
		this.clef = clef;
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return clef + " " + valeur;
	}
}
