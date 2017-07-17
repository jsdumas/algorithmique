package courseAutomobile;

public class Circuit1 {

	public static void main(String[] args) {
		final int positionLigne = 10000;
		boolean positionLigneAtteinte = false;
		NombreAl�atoireCourse nombreAlea = new NombreAl�atoireCourse();
		Automobile auto1 = new Automobile(105, nombreAlea);
		Automobile auto2 = new Automobile(100, nombreAlea);
		while (!positionLigneAtteinte) {
			auto1.avance();
			auto2.avance();
			if (auto1.aD�pass�(auto2))
				System.out.println("l'auto 1 a d�pass� l'auto 2");
			if (auto2.aD�pass�(auto1))
				System.out.println("l'auto 2 a d�pass� l'auto 1");
			if (auto1.aFranchiLigne(positionLigne)) {
				System.out.println("l'auto 1 a franchi la ligne");
				positionLigneAtteinte = true;
			}
			if (auto2.aFranchiLigne(positionLigne)) {
				System.out.println("l'auto 2 a franchi la ligne");
				positionLigneAtteinte = true;
			}
		}
	}
}
