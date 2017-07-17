package algorithmes.chapitres.chap4;

public class TestNombreAléatoire {

	public static void main(String[] args) {
		NombreAléatoire nombre = new NombreAléatoire(1, 10);
		for (int i = 0; i < 20; i++) {
			System.out.println(nombre.getValeur());
			nombre.reCalcule();
		}
	}
}
