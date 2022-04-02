package com.service.impl;

import com.modele.Materiel;
import com.service.api.GestionMaterielService;
import com.database.ListeMateriel;
public class GestionMaterielServiceImpl implements GestionMaterielService {
    // bd goes here
    ListeMateriel listeMateriel = new ListeMateriel();
    int nbBureau = 0;
    int nbChaise = 0;

    @Override
    public void init() {
        System.out.println("inititialisation du service");
    }

    @Override
    public void listerMateriel() {
         for( Materiel m : listeMateriel){
            if(m.getClass().getName().equals("Bureau")){
                nbBureau++;
            }else{
                nbChaise++;
            }
         }
        System.out.println("Liste de matériel : "+nbBureau +" bureau  "+ nbChaise +" 4 chaises");
    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {
        // à compléter
        listeMateriel.ajouterMateriel(materiel);
        System.out.println("L'ajout du matériel " + materiel.getName() + " effectué avec succès !");
    }

    @Override
    public void supprimerMateriel(Materiel materiel) {
        //cette methode est implementé dans ListeMateriel
        listeMateriel.supprimerMat(materiel);
    }
}
