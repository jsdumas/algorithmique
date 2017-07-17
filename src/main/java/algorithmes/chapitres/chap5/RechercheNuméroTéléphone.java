package algorithmes.chapitres.chap5;

import java.util.Scanner;

public class RechercheNum�roT�l�phone {

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

	public static boolean num�roT�l(String texte, int position) {
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

	public static String RechercheNumT�l(String texte) {
		final int longeurNum�ro = 14;
		int i = 0;
		int len = texte.length();
		while ((i <= len - longeurNum�ro) && !num�roT�l(texte, i))
			i++;
		if (i <= len - longeurNum�ro)
			return texte.substring(i, i + longeurNum�ro);
		else
			return null;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Entrez le texte : ");
		String texte = reader.nextLine();
		String numT�l = RechercheNumT�l(texte);
		if (numT�l != null)
			System.out.println("Le num�ro de t�l�phone est : " + numT�l);
		else
			System.out.println("Aucun num�ro de t�l�phone n'a �t� trouv�.");
	}
}
