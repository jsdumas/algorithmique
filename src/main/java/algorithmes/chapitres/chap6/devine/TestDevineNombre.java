package devine;

public class TestDevineNombre {

	public static void main(String[] args) {
		DevineNombre devineNombre = new DevineNombre();
		int nombreTentatives;
		nombreTentatives = devineNombre.devine(1, 20);
		System.out.println("gagné en " + nombreTentatives + " coups");		
	}
}
