﻿package designpatterns.chapitres.chap3.expression;public interface VisiteurExpression {    void visite(NoeudValeur c);    void visite(NoeudPlus c);    void visite(NoeudMoins c);}