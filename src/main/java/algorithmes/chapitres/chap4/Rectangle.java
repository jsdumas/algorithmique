public class Rectangle {
	int largeur, hauteur;

	public Rectangle(int largeur, int hauteur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int surface() {
		return largeur * hauteur;
	}

	public int périmètre() {
		return (largeur + hauteur) * 2;
	}
}
