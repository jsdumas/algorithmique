package algorithms.chapitres.chap5.entier;

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

	public String versChaîne() {
		String résultat = "";
		int nombreChiffres = 0;
		int copieValeur = Math.abs(valeur);
		while (copieValeur != 0) {
			if (nombreChiffres == 3) {
				nombreChiffres = 0;
				résultat = " " + résultat;
			}
			résultat = (char) (48 + copieValeur % 10) + résultat;
			copieValeur = copieValeur / 10;
			nombreChiffres++;
		}
		if (valeur < 0)
			résultat = "-" + résultat;
		else if (valeur == 0)
			résultat = "0";
		return résultat;
	}

	public void depuisChaîne(String s) {
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
					return; // chaîne incorrecte
			}
		}
		valeur = valeurTemp * signe;
	}
}
