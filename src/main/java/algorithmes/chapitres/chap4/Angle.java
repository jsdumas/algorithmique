public class Angle {
	double valeur=0; // la valeur en grades de l'angle

	public double getValeurGrades() {
		return valeur;
	}

	public void setValeurGrades(double valeur) {
		this.valeur = valeur;
	}

	public double getValeurDegrés() {
		return valeur*180/200;
	}

	public void setValeurDegrés(double valeur) {
		this.valeur = valeur*200/180;
	}

	public double getValeurRadians() {
		return valeur*Math.PI/200;
	}

	public void setValeurRadians(double valeur) {
		this.valeur = valeur*200/Math.PI;
	}
}
