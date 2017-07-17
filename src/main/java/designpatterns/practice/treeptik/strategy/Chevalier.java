package designpatterns.practice.treeptik.strategy;


public class Chevalier extends Personnage {

	public Chevalier() {
		super(new Epee());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attaquer() {
		super.attaquer();

	}

	@Override
	public int getNbVie() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNbVie(int i) {
		// TODO Auto-generated method stub

	}

}
