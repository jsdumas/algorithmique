package pileExpressionPostfix�e;

public class Pile {
	String[] tableau;
	int sommet;

	public Pile(int taille) {
		tableau = new String[taille];
		sommet = 0;
	}

	public boolean empile(String valeur) {
		if (sommet < tableau.length) {
			tableau[sommet] = valeur;
			sommet++;
			return true;
		} else
			return false;
	}
	
	public String d�pile() {
		if (sommet>0) {
			sommet--;
			return tableau[sommet];
		}
		return null;			
	}
}
