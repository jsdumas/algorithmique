﻿package designpatterns.chapitres.chap3.expression;public class VisiteurEvalExpression implements        VisiteurExpression {    protected int resultat;    protected int signe;    public int evaluer(Noeud c) {        resultat = 0;        signe = 1;        c.accepteVisiteur(this);        return resultat;    }    public void visite(NoeudPlus c) {        for (Noeud noeud : c.getEnfants())            noeud.accepteVisiteur(this);    }    public void visite(NoeudMoins c) {        signe = -signe;        for (Noeud noeud : c.getEnfants())            noeud.accepteVisiteur(this);        signe = -signe;    }    public void visite(NoeudValeur c) {        resultat = resultat + signe * c.getValeur();    }}