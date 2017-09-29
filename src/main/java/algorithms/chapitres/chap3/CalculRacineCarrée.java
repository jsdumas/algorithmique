package algorithms.chapitres.chap3;

import java.util.Scanner;

public class CalculRacineCarr�e {
	static class ParamDouble {
		public double valeur;
	}

	public static boolean racineCarr�e(double x, ParamDouble racine) {
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
		System.out.print("Entrez le nombre dont vous souhaitez la racine carr�e : ");
		x = reader.nextDouble();
		if (racineCarr�e(x, racine))
			System.out.println("La racine carr�e vaut : " + racine.valeur);
		else
			System.out.println("Impossible de calculer la racine carr�e !");
	}
}
