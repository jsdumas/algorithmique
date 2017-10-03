package designpatterns.treeptik.strategy.weapon;

import designpatterns.treeptik.strategy.action.Attaquer;

public class Gourdin implements Attaquer {

	protected Integer nbVies = 1;

	@Override
	public void attaquer() {
		System.out.println("Attaque au gourdin : enlève " + nbVies + " vies");

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
