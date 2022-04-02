package com.service.api;

import com.modele.Bureau;
import com.modele.Chaise;
import com.modele.Materiel;

public interface GestionChaiseService extends GestionMaterielService {
    void init();
    void listerMateriel();
    void ajouterNouveauMateriel(Bureau bureau);
    void supprimerMateriel(Bureau bureau);
}
