package devine;

public class Devine2 {
	NombreAl�atoire nombreAl�atoire;
	int nombreTentatives;

	public Devine2(NombreAl�atoire nombreAl�atoire) {
		this.nombreAl�atoire = nombreAl�atoire;
	}

	public int propose(int tentative) {
		nombreTentatives++;
		return nombreAl�atoire.compare(tentative);
	}

	public void initialise() {
		nombreTentatives = 0;
		nombreAl�atoire.reCalcule();
	}

	public int getBorneInf() {
		return nombreAl�atoire.getBorneInf();
	}

	public int getBorneSup() {
		return nombreAl�atoire.getBorneSup();
	}

	public int getNombreTentatives() {
		return nombreTentatives;
	}
}
