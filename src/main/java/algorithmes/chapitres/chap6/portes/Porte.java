package algorithmes.chapitres.chap6.portes;

public interface Porte {
	void setEntrée1(boolean valeur);

	void setEntrée2(boolean valeur);

	boolean getEntrée1();

	boolean getEntrée2();

	boolean getSortie();
}
