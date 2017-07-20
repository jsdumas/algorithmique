package algorithmes.sorting;
import java.io.*;
import java.util.*;

public class Tableau {
	/* Cette solution est bas�e sur :
	1) une classe Tableau qui contient les donn�es � trier et qui offre des
	m�thodes de tris ;
	2) une classe utilisatrice Tris_Tableau contenant la m�thode main
	*/
	private int[] tab; // �tat interne de la classe tableau
	
	Tableau() throws IOException // constructeur
	{
		// Collecte du nombre de valeurs � stocker
		BufferedReader in;
		in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Combien de valeurs a trier ? ");
		
		String input = in.readLine();
		int nbval = Integer.parseInt(input);
		// Cr�ation du tableau tab
		tab = new int[nbval];
		// Saisie des valeurs � trier dans le tableau tab
		System.out.print("Saisir les " + nbval + " a trier : ");
		Scanner Entree = new Scanner(System.in);
		int i = 0;
		do
		{
		tab[i] = Entree.nextInt();
		i++;
		nbval--;
		} while (nbval > 0);
	}
	
	/* Methode accessoire permettant d'�changer
	* dans le tableau tab des valeurs d'indice i et j
	*/
	public void swap(int i, int j)
	{
		int inter;
		inter=tab[i]; tab[i]=tab[j]; tab[j]=inter;
		return;
	}
	
	// Methode accessoire d'affichage des valeurs de tab comprises entre 2 indices
	public void show()
	{
		int i;
		String res = "{";
		for (i = 0; i < tab.length ; i++)
		{
			res += tab[i] + ",";
		}
		res += ((i == 0) ? "}\n" : "\b}\n");
		System.out.print(res);
	}
	
	//M�thode de tri utilisant le tri par s�lection des valeurs minimales
	public void selectsort()
	{
		int itop = tab.length - 1; // dernier indice du tableau
		int imin ; // indice du prochain emplacement � remplir
		for (int i = 0 ; i <= itop ; i++) // boucle sur tous les emplacements
		{
		imin = i;
		for(int j = i + 1; j <= itop ; j++)
		{ // recherche de l'indice de val mini dans la partie non tri�e du tableau
		if (tab[imin] > tab[j]) imin = j;
		}
		swap(imin,i);
		}
		return;
	}
	
	
	/* M�thode de tri utilisant le tri Shell */
	public void shell()
	{
		int h = 1; // calcul du pas
		while (h<tab.length) h = 3*h + 1;
			while (h>1)
			{
				h = h/3; // d�cr�mente h jusqu'� 1
				for (int i = h; i < tab.length ; i++)
			{
		int j = i;
		int valins = tab[i];
		// recherche de la position d'insertion
		// quand h �gal 1, c'est un tri par insertion
		while ((j >= h) && (valins < tab[j-h]))
		{
			tab[j] = tab[j-h];
			j -= h;
		}
		// insertion
		tab[j] = valins;
		show();
		}
		}
		return;
	}
}
