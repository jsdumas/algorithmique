package fr.treeptik.designpattern.runtime;

import java.util.Iterator;
import java.util.List;

import fr.treeptik.designpattern.initobjet.Deplacer;
import fr.treeptik.designpattern.proxy.FileDescription;
import fr.treeptik.designpattern.singleton.Singleton1;
import fr.treeptik.designpattern.singleton.Singleton2;

public class Runtime {

	private static int size;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		Personnage perso = new Personnage();
		Deplacer voiture = new Voiture();
		Chevalier chev1 =  new Chevalier();
		*/
		/*
		faireAvancer(perso);
		faireAvancer(voiture);
		faireAvancer(chev1);
		*/
		/*
		chev1.avancer(5);
		
		voiture.avancer();
		
		((Voiture)voiture).setMarque("test");
		
		if(voiture instanceof Voiture)
		{
			voiture = (Voiture)voiture;
			//System.out.println(voiture.getMarque());
		}
		*/
		
		/* Singleton 2 */
		/*
		Singleton2 s1 = Singleton2.getInstance("test1");
		Singleton2 s2 = Singleton2.getInstance(null);
		
		if(s1.equals(s2))
			System.out.println("instance unique");
		else
			System.out.println("instance multiple");
		
		System.out.println("S1 :"+s1);
		System.out.println("S2 :"+s2);
		*/
		/* Proxy */
		
		FileDescription filDesc = new FileDescription("Dictionnaire", "/home/stagiaire/liste.de.mots.francais.frgut.txt");
		List<String> lines = filDesc.getLines();
		
//		System.out.println(lines.get(5));
		
//		lines.forEach(System.out::println);
		
//		for(String line : lines)
//			System.out.println(line);
		
		Iterator<String> iterator = lines.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
	}
	
	public static void faireAvancer(Deplacer deplacer)
	{
		deplacer.avancer();
	}

}
