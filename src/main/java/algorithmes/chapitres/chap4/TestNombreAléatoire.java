public class TestNombreAl�atoire {

	public static void main(String[] args) {
		NombreAl�atoire nombre = new NombreAl�atoire(1,10);
		for (int i=0;i<20;i++) {
			System.out.println(nombre.getValeur());
			nombre.reCalcule();
		}
	}
}
