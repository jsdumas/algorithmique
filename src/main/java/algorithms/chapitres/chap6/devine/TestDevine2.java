package algorithms.chapitres.chap6.devine;

public class TestDevine2 {

	public static void main(String[] args) {
		final int min = 1;
		final int max = 12;
		int nbrTentatives;
		NombreAléatoire nbrAléatoire = new NombreAléatoire(min, max);
		DevineES devine = new DevineES(nbrAléatoire);
		nbrTentatives = devine.session();
		System.out.println("Nombre de tentatives = " + nbrTentatives);
	}
}
