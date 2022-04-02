package com.service.impl;

import com.modele.Bureau;
import com.modele.Materiel;
import com.service.api.GestionBureauService;

public class GestionBureauServiceImpl implements GestionBureauService {
    @Override
    public void init() {
        System.out.println("Le service de gestion de chaise vient de démarrer");
    }

    @Override
    public void listerMateriel() {
    //afficher tous les bureaux existant
        System.out.println("La liste contient n bureaux");

    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {

    }

    @Override
    public void supprimerMateriel(Materiel materiel) {

    }



}
