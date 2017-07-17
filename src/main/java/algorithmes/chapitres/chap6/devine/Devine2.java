package devine;

public class Devine2 {
	NombreAléatoire nombreAléatoire;
	int nombreTentatives;

	public Devine2(NombreAléatoire nombreAléatoire) {
		this.nombreAléatoire = nombreAléatoire;
	}

	public int propose(int tentative) {
		nombreTentatives++;
		return nombreAléatoire.compare(tentative);
	}

	public void initialise() {
		nombreTentatives = 0;
		nombreAléatoire.reCalcule();
	}

	public int getBorneInf() {
		return nombreAléatoire.getBorneInf();
	}

	public int getBorneSup() {
		return nombreAléatoire.getBorneSup();
	}

	public int getNombreTentatives() {
		return nombreTentatives;
	}
}
