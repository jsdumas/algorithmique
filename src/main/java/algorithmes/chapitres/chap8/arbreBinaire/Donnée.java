package arbreBinaire;

public class Donn�e {
	public int clef;
	public String valeur;
	
	public Donn�e(int clef, String valeur) {
		this.clef = clef;
		this.valeur = valeur;
	}
	
	public String toString() {
		return clef+" "+valeur;
	}
}
