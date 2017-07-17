﻿import java.util.*;

public abstract class SGBD {
    protected List<Connexion> connexions = new ArrayList<Connexion>();

    protected abstract Connexion creeConnexion(
            String utilisateur, String motdepasse);

    public Connexion nouvelleConnexion(
            String utilisateur, String motdepasse) {
        Connexion connexion = this.creeConnexion(
                utilisateur, motdepasse);
        connexions.add(connexion);
        return connexion;
    }
}
