package arbreBinaire;

public class Donnée {
	public int clef;
	public String valeur;
	
	public Donnée(int clef, String valeur) {
		this.clef = clef;
		this.valeur = valeur;
	}
	
	public String toString() {
		return clef+" "+valeur;
	}
}
