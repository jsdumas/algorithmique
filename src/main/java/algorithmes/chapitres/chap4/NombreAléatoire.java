public class NombreAléatoire {
	int valeur,borneInf,borneSup;
	
	public NombreAléatoire(int borneInferieure,int borneSuperieure) {
		borneInf=borneInferieure;
		borneSup=borneSuperieure;
		reCalcule();
	}
	
	public int getBorneInf() {
		return borneInf;
	}
	
	public int getBorneSup() {
		return borneSup;
	}
	
	public int getValeur() {
		return valeur;
	}
	
	public int compare(int valeur) {
		if (valeur==this.valeur) return 0;
		if (valeur>this.valeur) return 1;
		return -1;
	}
	
	public void reCalcule() {
		valeur=borneInf+(int)(Math.random()*(borneSup-borneInf+1));
	}
}
