package algorithms.chapitres.chap3;

public class FusionTableauxTriésModulaire {

	public static int généreNombreAléatoire(int borneInf, int borneSup) {
		return (int) ((borneSup - borneInf + 1) * Math.random()) + borneInf;
	}

	public static void remplitTableauAléatoire(int[] t, int borneInf, int borneSup) {
		for (int i = 0; i < t.length; i++)
			t[i] = généreNombreAléatoire(borneInf, borneSup);
	}

	public static void triBulle(int[] t) {
		int temp;
		boolean permuté;
		do {
			permuté = false;
			for (int i = 0; i < t.length - 1; i++) {
				if (t[i] > t[i + 1]) {
					// échange entre t[i] et t[i+1]
					temp = t[i];
					t[i] = t[i + 1];
					t[i + 1] = temp;
					permuté = true;
				}
			}
		} while (permuté);
	}

	public static int[] fusion(int[] t1, int[] t2) {
		// déclaration et création du résultat
		int taille3 = t1.length + t2.length;
		int[] t3 = new int[taille3];
		int i = 0;
		int j = 0;
		int k = 0;
		// remplissage de t3 à partir de t1 et t2
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

	public static void écrireTableau(int[] t) {
		for (int i = 0; i < t.length; i++)
			System.out.print(t[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		final int taille1 = 10;
		final int taille2 = 20;
		// déclaration et création des tableaux à trier et à fusionner
		int[] t1 = new int[taille1];
		int[] t2 = new int[taille2];
		// remplissage des deux tableaux
		remplitTableauAléatoire(t1, 0, 100);
		remplitTableauAléatoire(t2, 0, 100);
		// tri bulle de t1
		triBulle(t1);
		// tri bulle de t2
		triBulle(t2);
		// Affichage des tableaux
		System.out.println("Tableau t1 trié");
		écrireTableau(t1);
		System.out.println("Tableau t2 trié");
		écrireTableau(t2);
		// fusion des deux tableaux
		int[] t3 = fusion(t1, t2);
		System.out.println("Résultat de la fusion : ");
		écrireTableau(t3);
	}
}
