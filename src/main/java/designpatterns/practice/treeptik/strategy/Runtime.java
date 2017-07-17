package fr.treeptik.designpattern.strategy;

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
