package com.service.impl;

import com.database.impl.MaterialDaoImpl;
import com.database.impl.listMaterielImpl;
import com.modele.Materiel;
import com.service.api.GestionMaterielService;
import com.database.impl.listMaterielImpl;

public class GestionMaterielServiceImpl implements GestionMaterielService {



    public listMaterielImpl listMateriel ;
    public MaterialDaoImpl materialDao ;

    public int nbBureau = materialDao.getNbBureau();
    public int nbChaise = materialDao.getNbChaise();
    GestionMaterielServiceImpl(MaterialDaoImpl materialDao) {
        this.materialDao = materialDao;
    }
    GestionMaterielServiceImpl(){
        this.materialDao =new MaterialDaoImpl(listMateriel);
    }

    @Override
    public void init() {
        System.out.println("inititialisation du service");
    }

    @Override
    public void listerMateriel() {
        materialDao.listerMaterielDAO();
        System.out.println("Liste de matériel : " + nbBureau + " bureau  " + nbChaise + "chaises");
    }
    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {
        materialDao.ajouterMaterielDAO(materiel);
        System.out.println("L'ajout du matériel " + materiel.getName() + "a été effectué avec succès !");
    }

    @Override
    public void supprimerMateriel(String name) {
        materialDao.supprimerMaterielDAO(name);
        System.out.println("La suppression du matériel a été effectué avec succés !");
    }

    @Override
    public void modifierMateriel(Integer id,String name){
        materialDao.modifierMaterielDAO(id,name);
    }

    }


