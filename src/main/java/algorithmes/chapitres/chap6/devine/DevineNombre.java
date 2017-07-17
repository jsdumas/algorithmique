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
		int milieu, r�ponse;
		do {
			nbrTentatives++;
			milieu = (borneInf + borneSup) / 2;
			r�ponse = devineES.propose(milieu);
			if (r�ponse == 1)
				borneSup = milieu - 1;
			else if (r�ponse == -1)
				borneInf = milieu + 1;
		} while (r�ponse != 0);
		return nbrTentatives;
	}
}
