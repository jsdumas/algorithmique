package designpatterns.hf.behavioural.strategy.training.app;

import designpatterns.hf.behavioural.strategy.training.action.AttaquerDecorateur;
import designpatterns.hf.behavioural.strategy.training.character.Chevalier;
import designpatterns.hf.behavioural.strategy.training.character.Troll;
import designpatterns.hf.behavioural.strategy.training.weapon.Arc;
import designpatterns.hf.behavioural.strategy.training.weapon.Gourdin;

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
