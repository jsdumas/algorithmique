package composite;

public class Fichier implements Noeud {

	public long nombreFichiers() {
		return 1; // y compris le fichier lui-même
	}

	public long nombreRépertoires() {
		return 0;
	}
}
