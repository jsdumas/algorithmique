package algorithmes.sorting;

public class TriBulles {

	public static void main (String[] args)
	{
		

		int tab[] = {7,10,9,8,4,5,3,6,1,2};
		
		boolean permut;
		int indiceMax = tab.length;
		int compteur=1;
		
		do
		{
			permut=false;
			
			for (int i=1; i<indiceMax; i++)
			{
				//System.out.println(tab[i-1]);
				//System.out.println("tab[i] = "+tab[i]);
				//System.out.println("tab[i-1] = "+tab[i-1]);
				//System.out.println("============================");
				//System.out.println(compteur++);
				
				if(tab[i-1] > tab[i])
				{
					int change;
					change = tab[i];
					tab[i] = tab[i-1];
					tab[i-1] = change;
					//System.out.println("tab[i] ="+tab[i]);
					permut =true;
				}
				//System.out.println("tab[i] = "+tab[i]);
				//System.out.println("tab[i-1] = "+tab[i-1]);
				//System.out.println("============================");
				//System.out.println("============================");
			}
			//permut =true;
			indiceMax--;
		}
		while(permut);
		
		indiceMax = tab.length;
		
		for (int j=0; j<indiceMax; j++)
		System.out.println(tab[j]);
		//System.out.println(indiceMax);
		
}


}

