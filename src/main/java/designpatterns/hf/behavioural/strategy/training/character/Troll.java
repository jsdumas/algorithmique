package designpatterns.hf.behavioural.strategy.training.character;

import designpatterns.hf.behavioural.strategy.training.weapon.Gourdin;


public class Troll extends Personnage {

	public Troll() {
		super(new Gourdin());
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
