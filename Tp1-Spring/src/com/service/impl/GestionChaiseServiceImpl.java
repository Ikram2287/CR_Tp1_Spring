package com.service.impl;

import com.modele.Bureau;
import com.modele.Materiel;
import com.service.api.GestionChaiseService;

public class GestionChaiseServiceImpl implements GestionChaiseService {

    @Override
    public void init() {
        System.out.println("Le service de gestion de chaise vient de démarrer");
    }

    @Override
    public void listerMateriel() {

    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {

    }

    @Override
    public void supprimerMateriel(Materiel materiel) {

    }

    @Override
    public void ajouterNouveauMateriel(Bureau bureau) {

    }

    @Override
    public void supprimerMateriel(Bureau bureau) {

    }
}
