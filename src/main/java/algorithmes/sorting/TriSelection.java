package algorithmes.sorting;

public class TriSelection {
	
	public static void main (String[] args)
	{
		

		int tab[] = {7,10,9,8,4,5,3,6,1,2};
		
		int indiceMax = tab.length;
		int indiceDebut=0;
		int echange;
		
		for (int i=0; i<indiceMax; i++)
		{
			int imin=i;
			
			for(int j=imin; j<indiceMax; j++)
			{
				if(tab[j]<tab[imin])
					imin=j;
			}
			
			echange=tab[imin];
			tab[imin]=tab[i];
			tab[i]=echange;
			indiceDebut++;
		}
		
		for (int k=0; k<indiceMax; k++)
			System.out.println(tab[k]);
	}

}
