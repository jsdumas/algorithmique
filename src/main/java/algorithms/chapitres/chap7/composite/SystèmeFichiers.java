package algorithms.chapitres.chap7.composite;

public class Syst�meFichiers {

	public static void main(String[] args) {
		R�pertoire syst�me = new R�pertoire();
		R�pertoire r�pertoire1 = new R�pertoire();
		R�pertoire r�pertoire2 = new R�pertoire();
		r�pertoire1.ajouteNoeud(new Fichier());
		r�pertoire1.ajouteNoeud(new Fichier());
		r�pertoire2.ajouteNoeud(new Fichier());
		r�pertoire2.ajouteNoeud(new Fichier());
		r�pertoire2.ajouteNoeud(new Fichier());
		syst�me.ajouteNoeud(r�pertoire1);
		syst�me.ajouteNoeud(r�pertoire2);
		syst�me.ajouteNoeud(new Fichier());
		System.out.println(" Nombre de fichiers dans le syst�me : " + syst�me.nombreFichiers());
		System.out.println(" Nombre de r�pertoire dans le syst�me : " + syst�me.nombreR�pertoires());
	}
}
