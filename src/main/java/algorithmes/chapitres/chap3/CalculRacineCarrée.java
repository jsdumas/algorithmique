package algorithmes.chapitres.chap3;

import java.util.Scanner;

public class CalculRacineCarrée {
	static class ParamDouble {
		public double valeur;
	}

	public static boolean racineCarrée(double x, ParamDouble racine) {
		if (x >= 0) {
			racine.valeur = Math.sqrt(x);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double x;
		ParamDouble racine = new ParamDouble();
		System.out.print("Entrez le nombre dont vous souhaitez la racine carrée : ");
		x = reader.nextDouble();
		if (racineCarrée(x, racine))
			System.out.println("La racine carrée vaut : " + racine.valeur);
		else
			System.out.println("Impossible de calculer la racine carrée !");
	}
}
