package com.database.api;

import com.modele.Materiel;

public interface MaterialDao {
    void listerMaterielDAO();
    Materiel rechercheParNameDAO(String name);
    void ajouterMaterielDAO(Materiel materiel);
    void supprimerMaterielDAO(String name);
    void modifierMaterielDAO(Integer id,String name);

}
