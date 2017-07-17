package devine;

public class DevineNombre2{
	LienDevine lien;
	NombreAléatoire nbrAléatoire;
	
	public DevineNombre2(NombreAléatoire nbrAléatoire) {
		this.nbrAléatoire = nbrAléatoire;
		this.lien = new LienDevine(nbrAléatoire);
	}

	public int devine() {
		int borneInf = nbrAléatoire.getBorneInf();
		int borneSup = nbrAléatoire.getBorneSup();
		int milieu, réponse;
		lien.initialise();
		do {
			milieu = (borneInf + borneSup) / 2;			
			réponse = lien.propose(milieu);
			if (réponse == 1)
				borneSup = milieu - 1;
			else if (réponse == -1)
				borneInf = milieu + 1;
		} while (réponse != 0);
		return lien.getNombreTentatives();
	}
}
