package fr.treeptik.designpattern.strategy;

public class Gourdin implements Attaquer {

	protected Integer nbVies = 1;
	
	@Override
	public void attaquer() {
		System.out.println("Attaque au gourdin : enlève "+nbVies+" vies");

	}

	@Override
	public int getNbVie() {
		// TODO Auto-generated method stub
		return this.nbVies;
	}

	@Override
	public void setNbVie(int i) {
		this.nbVies = i;
		
	}

}
