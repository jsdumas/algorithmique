package devine;

import java.util.Scanner;
public class DevineES {
	Scanner parser = new Scanner(System.in);
	Devine2 nombreDevine;

	public DevineES(NombreAléatoire nombreAléatoire) {
		nombreDevine = new Devine2(nombreAléatoire);
	}
	
	public int session() {
		int tentative, resultat = 0;
		nombreDevine.initialise();
		do {
			System.out.print("Proposez un nombre entier entre "
					+ nombreDevine.getBorneInf() + " et "
					+ nombreDevine.getBorneSup() + " : ");
			tentative = parser.nextInt();
			resultat = nombreDevine.propose(tentative);
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
		} while (resultat != 0);
		return nombreDevine.getNombreTentatives();
	}
}
