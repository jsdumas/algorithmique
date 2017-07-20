package algorithmes.sorting;

public class TriShell {
	
	public static void main (String[] args)
	{
		

		int tab[] = {12, 4,11, 9, 2, 6, 5, 10, 7, 13, 18, 14, 1, 0, 3};
		
		int indiceMax = tab.length;
		int indiceDebut=0;
		int echange;
		int pas=0;
		
		while(pas<indiceMax)
		{
			pas=3*pas+1;
			System.out.println("Longueur du tableau "+indiceMax);
			System.out.println("Le pas est de "+pas);
			System.out.println("-----------------------------");
		}
		
		
		while(pas>1)
		{
			pas=(pas-1)/3;
			System.out.println("Le pas est de "+pas);
			System.out.println("-----------------------------");
			System.out.println("-----------------------------");
			int i=pas;
			
			for(i=pas; i<indiceMax; i++)
			{
				int valins = tab[i];
				int j=i;				
				System.out.println("Valeur de valin "+valins);
				System.out.println("Valeur de j "+j);
				System.out.println("-----------------------------");
				System.out.println("-----------------------------");
				System.out.println("-----------------------------");
				
				while ((j>=pas) && (tab[j-pas]>valins))
				{
					System.out.println("La valeur de tab[j] est de "+tab[j]);
					tab[j]=tab[j-pas];
					j=j-pas;
					System.out.println("La nouvelle valeur de tab[j] est de "+tab[j]);
					System.out.println("La valeur de pas est de "+pas);
					System.out.println("La valeur de j est de "+j);
				}
				tab[j]=valins;


			}
			
			
		}
		
		
		for (int k=0; k<indiceMax; k++)
			System.out.println(tab[k]);
	}
}
