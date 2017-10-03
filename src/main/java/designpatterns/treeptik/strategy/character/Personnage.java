package designpatterns.treeptik.strategy.character;

import designpatterns.treeptik.strategy.action.Attaquer;

public abstract class Personnage implements Attaquer {

	private String nom;
	protected Attaquer attaquer;

	public Personnage(Attaquer attaquer) {
		this.attaquer = attaquer;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public void attaquer() {
		this.attaquer.attaquer();

	}

	public Attaquer getAttaquer() {
		return attaquer;
	}

	public void setAttaquer(Attaquer attaquer) {
		this.attaquer = attaquer;
	}

}
