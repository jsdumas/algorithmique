package algorithmes.chapitres.chap3;

public class FusionTableauxTri�sModulaire {

	public static int g�n�reNombreAl�atoire(int borneInf, int borneSup) {
		return (int) ((borneSup - borneInf + 1) * Math.random()) + borneInf;
	}

	public static void remplitTableauAl�atoire(int[] t, int borneInf, int borneSup) {
		for (int i = 0; i < t.length; i++)
			t[i] = g�n�reNombreAl�atoire(borneInf, borneSup);
	}

	public static void triBulle(int[] t) {
		int temp;
		boolean permut�;
		do {
			permut� = false;
			for (int i = 0; i < t.length - 1; i++) {
				if (t[i] > t[i + 1]) {
					// �change entre t[i] et t[i+1]
					temp = t[i];
					t[i] = t[i + 1];
					t[i + 1] = temp;
					permut� = true;
				}
			}
		} while (permut�);
	}

	public static int[] fusion(int[] t1, int[] t2) {
		// d�claration et cr�ation du r�sultat
		int taille3 = t1.length + t2.length;
		int[] t3 = new int[taille3];
		int i = 0;
		int j = 0;
		int k = 0;
		// remplissage de t3 � partir de t1 et t2
		while ((i < t1.length) && (j < t2.length)) {
			if (t1[i] < t2[j]) {
				t3[k] = t1[i];
				i++;
			} else {
				t3[k] = t2[j];
				j++;
			}
			k++;
		}
		while (i < t1.length) {
			t3[k] = t1[i];
			i++;
			k++;
		}
		while (j < t2.length) {
			t3[k] = t2[j];
			j++;
			k++;
		}
		return t3;
	}

	public static void �crireTableau(int[] t) {
		for (int i = 0; i < t.length; i++)
			System.out.print(t[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		final int taille1 = 10;
		final int taille2 = 20;
		// d�claration et cr�ation des tableaux � trier et � fusionner
		int[] t1 = new int[taille1];
		int[] t2 = new int[taille2];
		// remplissage des deux tableaux
		remplitTableauAl�atoire(t1, 0, 100);
		remplitTableauAl�atoire(t2, 0, 100);
		// tri bulle de t1
		triBulle(t1);
		// tri bulle de t2
		triBulle(t2);
		// Affichage des tableaux
		System.out.println("Tableau t1 tri�");
		�crireTableau(t1);
		System.out.println("Tableau t2 tri�");
		�crireTableau(t2);
		// fusion des deux tableaux
		int[] t3 = fusion(t1, t2);
		System.out.println("R�sultat de la fusion : ");
		�crireTableau(t3);
	}
}
