import java.util.Scanner;
public class Devine {
	NombreAl�atoire nombreAl�atoire;
	Scanner parser = new Scanner(System.in);

	public Devine(NombreAl�atoire nombreAl�atoire) {
		this.nombreAl�atoire = nombreAl�atoire;
	}

	public int session() {
		int tentative, resultat, nbrTentatives = 0;
		do {
			System.out.print("Proposez un nombre entier entre "
					+ nombreAl�atoire.getBorneInf() + " et "
					+ nombreAl�atoire.getBorneSup() + " : ");
			tentative = parser.nextInt();
			resultat = nombreAl�atoire.compare(tentative);
			switch (resultat) {
			case -1: {
				System.out.println("Votre tentative est trop petite !");
				break;
			}
			case 0: {
				System.out.println("Vous avez trouv� le nombre !");
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
