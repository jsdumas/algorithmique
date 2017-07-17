package fr.treeptik.designpattern.strategy;

public class AttaquerDecorateur implements Attaquer {
	
	private Attaquer attaquer;

	public AttaquerDecorateur(Attaquer attaquer) {
		this.attaquer = attaquer;
		this.attaquer.setNbVie(attaquer.getNbVie()+1);
	}
	
	@Override
	public void attaquer() {
		// TODO Auto-generated method stub
		attaquer.attaquer();
	}

	@Override
	public int getNbVie() {
		// TODO Auto-generated method stub
		return attaquer.getNbVie();
	}

	@Override
	public void setNbVie(int i) {
		attaquer.setNbVie(i);
		
	}

}
