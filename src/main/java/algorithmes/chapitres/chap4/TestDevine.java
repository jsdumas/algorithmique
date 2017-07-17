package algorithmes.chapitres.chap4;

public class TestDevine {

	public static void main(String[] args) {
		final int min = 1;
		final int max = 12;
		int nbrTentatives;
		NombreAléatoire nbrAléatoire = new NombreAléatoire(min, max);
		Devine devine = new Devine(nbrAléatoire);
		nbrTentatives = devine.session();
		System.out.println("Nombre de tentatives = " + nbrTentatives);
	}
}
