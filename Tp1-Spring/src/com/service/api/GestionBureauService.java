package com.service.api;

import com.modele.Bureau;
import com.modele.Chaise;
import com.modele.Materiel;

public interface GestionBureauService extends GestionMaterielService{
    void init();
    void listerMateriel();
    void ajouterNouveauMateriel(Materiel materiel);
    void supprimerMateriel(Materiel materiel);
}
