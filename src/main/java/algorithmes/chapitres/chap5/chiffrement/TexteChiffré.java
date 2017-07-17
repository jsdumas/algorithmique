package chiffrement;

public class TexteChiffr� {
	String texte;

	public TexteChiffr�(String texte) {
		this.texte = texte;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public void chiffre() {
		String nouveauTexte = "";
		for (int i = 0; i < texte.length(); i++) {
			char c = texte.charAt(i);
			if (((c >= 'a') && (c <= 'z'))) {
				int rang = (int) c - 96;
				rang = rang + 13;
				if (rang > 26)
					rang = rang - 26;
				c = (char) (rang + 96);
			}
			if (((c >= 'A') && (c <= 'Z'))) {
				int rang = (int) c - 64;
				rang = rang + 13;
				if (rang > 26)
					rang = rang - 26;
				c = (char) (rang + 64);
			}
			nouveauTexte = nouveauTexte + c;
		}
		texte = nouveauTexte;
	}
}
