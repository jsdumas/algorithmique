public interface Element {
    int getNombreEnfants();

    ElementXML getEnfant(int index);

    ElementXML getPremierEnfantAvecTag(String tag);
}
