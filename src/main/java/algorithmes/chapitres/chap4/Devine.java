import java.util.Scanner;
public class Devine {
	NombreAléatoire nombreAléatoire;
	Scanner parser = new Scanner(System.in);

	public Devine(NombreAléatoire nombreAléatoire) {
		this.nombreAléatoire = nombreAléatoire;
	}

	public int session() {
		int tentative, resultat, nbrTentatives = 0;
		do {
			System.out.print("Proposez un nombre entier entre "
					+ nombreAléatoire.getBorneInf() + " et "
					+ nombreAléatoire.getBorneSup() + " : ");
			tentative = parser.nextInt();
			resultat = nombreAléatoire.compare(tentative);
			switch (resultat) {
			case -1: {
				System.out.println("Votre tentative est trop petite !");
				break;
			}
			case 0: {
				System.out.println("Vous avez trouvé le nombre !");
				break;
			}
			case 1: {
				System.out.println("Votre tentative est trop grande !");
				break;
			}
			}
			nbrTentatives++;
		} while (resultat != 0);
		return nbrTentatives;
	}
}
