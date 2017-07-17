package algorithmes.chapitres.chap5.entier;

public class Entier {
	int valeur;

	public Entier(int valeur) {
		this.valeur = valeur;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public String versCha�ne() {
		String r�sultat = "";
		int nombreChiffres = 0;
		int copieValeur = Math.abs(valeur);
		while (copieValeur != 0) {
			if (nombreChiffres == 3) {
				nombreChiffres = 0;
				r�sultat = " " + r�sultat;
			}
			r�sultat = (char) (48 + copieValeur % 10) + r�sultat;
			copieValeur = copieValeur / 10;
			nombreChiffres++;
		}
		if (valeur < 0)
			r�sultat = "-" + r�sultat;
		else if (valeur == 0)
			r�sultat = "0";
		return r�sultat;
	}

	public void depuisCha�ne(String s) {
		int valeurTemp, signe;
		valeurTemp = 0;
		signe = 1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				if ((i == 0) && (c == '-'))
					signe = -1;
				else if ((c >= '0') && (c <= '9'))
					valeurTemp = 10 * valeurTemp + c - 48;
				else
					return; // cha�ne incorrecte
			}
		}
		valeur = valeurTemp * signe;
	}
}
