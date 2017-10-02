package designpatterns.treeptik.initobjet;

import java.util.Date;

public class Voiture implements Deplacer {
	private String marque;
	private String modele;
	private Date dateMiseEnCirculation;

	public Voiture() {
		super();
	}

	public Voiture(String marque, String modele, Date dateMiseEnCirculation) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.dateMiseEnCirculation = dateMiseEnCirculation;
	}

	@Override
	public void avancer() {
		// TODO Auto-generated method stub
		System.out.println("Voiture avancer");

	}

	@Override
	public void reculer() {
		// TODO Auto-generated method stub
		System.out.println("Voiture reculer");
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public Date getDateMiseEnCirculation() {
		return dateMiseEnCirculation;
	}

	public void setDateMiseEnCirculation(Date dateMiseEnCirculation) {
		this.dateMiseEnCirculation = dateMiseEnCirculation;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
