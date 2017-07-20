package algorithmes.sorting;
import java.io.*;
import java.util.*;

public class TriBullesV1 {
	/* Implantation directe du tri Bulle dans une méthode du programme
	principal à laquelle on passe un tableau */
	

	/** Methode accessoire permettant d'échanger dans un tableau passé en
	paramètre les valeurs d'indices i et j */
	public static void swap(int[] a, int i, int j)
	{
		int inter;
		inter=a[i]; a[i]=a[j]; a[j]=inter;
		return;
	}
	
	// Methode accessoire d'affichage des valeurs d'un tableau
	// inclusivement comprises entre 2 indices
	public static void show(int[] a, int d, int f)
	{
		String res = "{";
		for (int i = d; i <= f; i++)
		{
		res += a[i] + ",";
		} 
		res += ((f<d)?"}\n" : "\b}\n");
		System.out.print(res);
	}
	
	// Méthode du Tri Bulles
	public static void bubblesort(int[] tab)
	{
		int itop = tab.length - 1; // dernier indice du tableau non place
		boolean permut = true; // flag indicateur de permutation
		
		while (permut) // boucle pple
			{
					
			permut = false;
			
			for(int i = 1; i <= itop ; i++)
			{ // parcours de la partie inférieure non triée du tableau
				if (tab[i-1] > tab[i])
				{
				swap(tab, i, i-1);
				permut = true;
				}
			}
			
			itop--; // maj du dernier indice non placé
			} 
	return;
}



/***************************/

public static void main(String[] args) throws IOException
	{
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Combien de valeurs a trier ? ");
		String input = in.readLine();
		int nbval = Integer.parseInt(input);
		
		// Construction, saisie et affichage du tableau initial
		int [] t1;
		t1 = new int[nbval];
		System.out.print("Saisir les " + nbval + " a trier : ");
		Scanner Entree = new Scanner(System.in);
		
		int i = 0;
		do
		{
			t1[i] = Entree.nextInt();
			i++;
			nbval--;
		} while (nbval > 0);
		
		System.out.print("Liste initiale : " );
		show(t1, 0, t1.length-1);
		
		try
		{
			bubblesort(t1);
		}
		catch(Exception e)
		{
			System.out.println("Attention : " + e);
		}
		
		System.out.print("Liste triee : ");
		show(t1,0, t1.length-1);
		System.out.println("FIN");
	}

}
