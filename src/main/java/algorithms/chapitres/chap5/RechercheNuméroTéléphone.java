package algorithms.chapitres.chap5;

import java.util.Scanner;

public class RechercheNuméroTéléphone {

	public static boolean deuxChiffres(String texte, int position) {
		final int premierIndiceImpossible = 1;
		if (position >= texte.length() - premierIndiceImpossible)
			return false;
		char c = texte.charAt(position);
		char c1 = texte.charAt(position + 1);
		return ((c >= '0') && (c <= '9') && (c1 >= '0') && (c1 <= '9'));
	}

	public static boolean deuxChiffresUnPoint(String texte, int position) {
		final int premierIndiceImpossible = 2;
		if (position >= texte.length() - premierIndiceImpossible)
			return false;
		return deuxChiffres(texte, position) && (texte.charAt(position + 2) == '.');
	}

	public static boolean numéroTél(String texte, int position) {
		final int nombrePoints = 4;
		final int premierIndiceImpossible = 13;

		int i, positionTexte;

		if (position >= texte.length() - premierIndiceImpossible)
			return false;
		i = 0;
		positionTexte = position;
		while ((i < nombrePoints) && deuxChiffresUnPoint(texte, positionTexte)) {
			i++;
			positionTexte += 3;
		}
		if (i == nombrePoints) {
			if (deuxChiffres(texte, positionTexte))
				return true;
		}
		return false;
	}

	public static String RechercheNumTél(String texte) {
		final int longeurNuméro = 14;
		int i = 0;
		int len = texte.length();
		while ((i <= len - longeurNuméro) && !numéroTél(texte, i))
			i++;
		if (i <= len - longeurNuméro)
			return texte.substring(i, i + longeurNuméro);
		else
			return null;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez le texte : ");
		String texte = reader.nextLine();
		String numTél = RechercheNumTél(texte);
		if (numTél != null)
			System.out.println("Le numéro de téléphone est : " + numTél);
		else
			System.out.println("Aucun numéro de téléphone n'a été trouvé.");
	}
}
