package algorithms.practice.stringofcharacters.knuthmorrispratt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KnuthMorrisPratt {

	/** Failure array **/
	private final int[] failure;

	/** Constructor **/
	public KnuthMorrisPratt(String text, String pattern) {
		/** pre construct failure array for a pattern **/
		failure = new int[pattern.length()];// Initialisation d'un tableau à la longueur du String pattern
		fail(pattern);
		/** find match **/
		int pos = posMatch(text, pattern);
		if (pos == -1)
			System.out.println("\nNo match found");
		else
			System.out.println("\nMatch found at index " + pos);
	}

	/**
	 * Valorisation du taleau failure afin d'identifier une séquence de caractère qui se répète depuis le premier caractère.
	 **/
	private void fail(String pattern) {
		int patternLength = pattern.length();// longueur du pattern
		// Tableau de failure initialisé à -1 pour la première valeur
		failure[0] = -1;
		for (int j = 1; j < patternLength; j++) { // boucle sur la longueur du pattern
			int failureValue = failure[j - 1]; // initialise failureValue sur la précédente valeur du tableau failure
			// Boucle tant que failureValue >=0
			// et que la valeur de la lettre du pattern courante est différente de la lettre du pattern à la position failureValue + 1
			while ((pattern.charAt(j) != pattern.charAt(failureValue + 1)) && failureValue >= 0)
				failureValue = failure[failureValue]; // failureValue égale valeur du tableau failure à la position failureValue
			//
			if (pattern.charAt(j) == pattern.charAt(failureValue + 1))
				failure[j] = failureValue + 1;
			else
				failure[j] = -1;
		}
		for (int i = 0; i < failure.length; i++) {
			System.out.println("failure " + failure[i]);
		}
	}

	/** Function to find match for a pattern **/
	private int posMatch(String text, String pat) {
		int i = 0, j = 0;
		int lens = text.length(); // longueur du texte
		int lenp = pat.length(); // longueur du pattern
		while (i < lens && j < lenp) {
			if (text.charAt(i) == pat.charAt(j)) {
				i++;
				j++;
			} else if (j == 0)// si le première caractère text est différent du premier caractère pat alors i++
				i++;
			else
				j = failure[j - 1] + 1;// Dans le cas ou caractère text est différent de caratère pat
										// et qu'on est pas sur le premier caratère de pat
										// alors l'index de pat = la valeur +1 du tableau de failure aillant comme indice
										// le précédent caractère de pat
		}
		return ((j == lenp) ? (i - lenp) : -1);
	}

	/** Main Function **/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Knuth Morris Pratt Test\n");
		System.out.println("\nEnter Text\n");
		String text = br.readLine();
		System.out.println("\nEnter Pattern\n");
		String pattern = br.readLine();
		KnuthMorrisPratt kmp = new KnuthMorrisPratt(text, pattern);
	}

}
