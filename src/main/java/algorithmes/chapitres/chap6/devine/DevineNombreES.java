package devine;

import java.util.Scanner;
public class DevineNombreES {
	Scanner reader = new Scanner(System.in);
	
	public int propose(int tentative) {
		System.out.println("je propose " + tentative);
		System.out.println("R�pondez -1 si le nombre propos� est trop petit");
		System.out.print("1 s'il est trop grand, 0 pour gagn� : ");
		int r�ponse = reader.nextInt();
		return r�ponse;
	}
}
