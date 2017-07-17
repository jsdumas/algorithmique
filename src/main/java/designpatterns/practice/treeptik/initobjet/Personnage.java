package fr.treeptik.designpattern.initobjet;

import java.io.Serializable;

public class Personnage implements Deplacer, Serializable{

	private static final long serialVersionUID = 1L;
	protected String nom;
	private Integer nbVie;
	
	public Personnage() {
		// TODO Auto-generated constructor stub
	}
	
	public Personnage(String nom, Integer nbVie) {
		super();
		this.nom = nom;
		this.nbVie = nbVie;
	}



	@Override
	public void avancer() {
		// TODO Auto-generated method stub
		System.out.println("Personnage avancer");		
	}

	@Override
	public void reculer() {
		// TODO Auto-generated method stub
		System.out.println("Personnage reculer");		

	}
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public Integer getNbVie() {
		return nbVie;
	}



	public void setNbVie(Integer nbVie) {
		this.nbVie = nbVie;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
