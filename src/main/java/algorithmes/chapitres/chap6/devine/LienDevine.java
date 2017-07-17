package algorithmes.chapitres.chap6.devine;

public class LienDevine {
	Devine2 nombreDevine;

	public LienDevine(NombreAléatoire nombreAléatoire) {
		nombreDevine = new Devine2(nombreAléatoire);
	}

	public int propose(int tentative) {
		int résultat;
		System.out.println("Tentative : " + tentative);
		résultat = nombreDevine.propose(tentative);
		switch (résultat) {
			case -1:
				System.out.println("Le nombre à deviner est supérieur à la tentative.");
				break;
			case 0:
				System.out.println("Nombre trouvé");
				break;
			case 1:
				System.out.println("Le nombre à deviner est inférieur à la tentative.");
				break;
		}
		return résultat;
	}

	public void initialise() {
		nombreDevine.initialise();
	}

	public int getNombreTentatives() {
		return nombreDevine.getNombreTentatives();
	}
}
