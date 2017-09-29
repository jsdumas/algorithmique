package algorithms.chapitres.chap7.composite;

public class Fichier implements Noeud {

	@Override
	public long nombreFichiers() {
		return 1; // y compris le fichier lui-même
	}

	@Override
	public long nombreRépertoires() {
		return 0;
	}
}
