package com.service.api;

import com.modele.Materiel;

public interface
GestionMaterielService {
    void init();
    void listerMateriel();
    void ajouterNouveauMateriel(Materiel materiel);
    void supprimerMateriel(Materiel materiel);
}
