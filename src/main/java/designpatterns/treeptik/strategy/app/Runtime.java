package designpatterns.treeptik.strategy.app;

import designpatterns.treeptik.strategy.action.AttaquerDecorateur;
import designpatterns.treeptik.strategy.character.Chevalier;
import designpatterns.treeptik.strategy.character.Troll;
import designpatterns.treeptik.strategy.weapon.Arc;
import designpatterns.treeptik.strategy.weapon.Gourdin;

public class Runtime {

	public static void main(String[] args) {

		Chevalier chevalier = new Chevalier();

		chevalier.attaquer();

		Troll troll = new Troll();

		troll.attaquer();

		chevalier.setAttaquer(new Arc());

		chevalier.attaquer();

		chevalier.setAttaquer(new Gourdin());

		chevalier.setAttaquer(new AttaquerDecorateur(chevalier.getAttaquer()));

		chevalier.attaquer();

		chevalier.setAttaquer(new AttaquerDecorateur(chevalier.getAttaquer()));

		chevalier.attaquer();

	}

}
