package chapitre_1;

import java.util.Scanner;

public class LivretEpargne {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double montantInitial, int�r�t, montantEpargn�;
		int nombreAnn�es, i;
		System.out.print("Entrez le montant initial : ");
		montantInitial = reader.nextDouble();
		System.out.print("Entrez le taux d'int�r�t en pour cent : ");
		int�r�t = reader.nextDouble();
		System.out.print("Entrez le nombre d'ann�es : ");
		nombreAnn�es = reader.nextInt();
		// calcul et affichage du montant �pargn�
		montantEpargn� = montantInitial;
		for (i = 1; i <= nombreAnn�es; i++) {
			montantEpargn� = montantEpargn� * (1.0 + int�r�t / 100);
			System.out.println("Apr�s la " + i + " ann�e, le montant �pargn� est de : " + montantEpargn�);
		}
	}
}
