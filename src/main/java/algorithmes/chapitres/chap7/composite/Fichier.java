package composite;

public class Fichier implements Noeud {

	public long nombreFichiers() {
		return 1; // y compris le fichier lui-m�me
	}

	public long nombreR�pertoires() {
		return 0;
	}
}
