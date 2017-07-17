package devine;

public class DevineNombre2{
	LienDevine lien;
	NombreAl�atoire nbrAl�atoire;
	
	public DevineNombre2(NombreAl�atoire nbrAl�atoire) {
		this.nbrAl�atoire = nbrAl�atoire;
		this.lien = new LienDevine(nbrAl�atoire);
	}

	public int devine() {
		int borneInf = nbrAl�atoire.getBorneInf();
		int borneSup = nbrAl�atoire.getBorneSup();
		int milieu, r�ponse;
		lien.initialise();
		do {
			milieu = (borneInf + borneSup) / 2;			
			r�ponse = lien.propose(milieu);
			if (r�ponse == 1)
				borneSup = milieu - 1;
			else if (r�ponse == -1)
				borneInf = milieu + 1;
		} while (r�ponse != 0);
		return lien.getNombreTentatives();
	}
}
