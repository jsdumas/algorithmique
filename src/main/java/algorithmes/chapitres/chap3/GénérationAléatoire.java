import java.util.Scanner;
public class G�n�rationAl�atoire {

	public static int g�n�reNombreAl�atoire(int borneInf, int borneSup) {
		return (int) ((borneSup - borneInf + 1) * Math.random()) + borneInf;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int borneInf, borneSup;
		int nombreAl�atoire;
		System.out.print("Entrez la borne inf�rieure : ");
		borneInf = reader.nextInt();
		System.out.print("Entrez la borne sup�rieure : ");
		borneSup = reader.nextInt();
		nombreAl�atoire = g�n�reNombreAl�atoire(borneInf, borneSup);
		System.out.println("Le nombre al�atoire g�n�r� est : "
				+ nombreAl�atoire);
	}
}
