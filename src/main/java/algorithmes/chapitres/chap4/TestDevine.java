public class TestDevine {

	public static void main(String[] args) {
		final int min=1;
		final int max=12;
		int nbrTentatives;
		NombreAl�atoire nbrAl�atoire = new NombreAl�atoire(min,max);
		Devine devine = new Devine(nbrAl�atoire);
		nbrTentatives = devine.session();
		System.out.println("Nombre de tentatives = "+nbrTentatives);
	}
}
