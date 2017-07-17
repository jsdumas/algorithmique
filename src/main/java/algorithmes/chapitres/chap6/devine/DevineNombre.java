package algorithmes.chapitres.chap6.devine;

public class DevineNombre {
	DevineNombreES devineES;

	public DevineNombre() {
		devineES = new DevineNombreES();
	}

	public int devine(int inf, int sup) {
		int borneInf = inf;
		int borneSup = sup;
		int nbrTentatives = 0;
		int milieu, réponse;
		do {
			nbrTentatives++;
			milieu = (borneInf + borneSup) / 2;
			réponse = devineES.propose(milieu);
			if (réponse == 1)
				borneSup = milieu - 1;
			else if (réponse == -1)
				borneInf = milieu + 1;
		} while (réponse != 0);
		return nbrTentatives;
	}
}
