package devine;

public class LienDevine {
	Devine2 nombreDevine;

	public LienDevine(NombreAl�atoire nombreAl�atoire) {
		nombreDevine = new Devine2(nombreAl�atoire);
	}

	public int propose(int tentative) {
		int r�sultat;
		System.out.println("Tentative : " + tentative);
		r�sultat = nombreDevine.propose(tentative);
		switch (r�sultat) {
		case -1:
			System.out.println("Le nombre � deviner est sup�rieur � la tentative.");
			break;
		case 0:
			System.out.println("Nombre trouv�");
			break;
		case 1:
			System.out.println("Le nombre � deviner est inf�rieur � la tentative.");
			break;
		}
		return r�sultat;
	}

	public void initialise() {
		nombreDevine.initialise();
	}

	public int getNombreTentatives() {
		return nombreDevine.getNombreTentatives();
	}
}
