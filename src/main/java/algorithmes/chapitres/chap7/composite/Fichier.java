package algorithmes.chapitres.chap7.composite;

public class Fichier implements Noeud {

	@Override
	public long nombreFichiers() {
		return 1; // y compris le fichier lui-m�me
	}

	@Override
	public long nombreR�pertoires() {
		return 0;
	}
}
