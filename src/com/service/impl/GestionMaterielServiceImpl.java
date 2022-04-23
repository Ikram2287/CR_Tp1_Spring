package com.service.impl;

import com.database.impl.MaterialDaoImpl;
import com.database.impl.listMaterielImpl;
import com.modele.Materiel;
import com.service.api.GestionMaterielService;
import com.database.impl.listMaterielImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Service
@Component
public class GestionMaterielServiceImpl implements GestionMaterielService {

    @Autowired
    private int nbBureau;
    @Autowired
    private int nbChaise;

    @Autowired
    private listMaterielImpl listMateriel ;

    @Autowired
    private MaterialDaoImpl materialDao ;

    public int getNbBureau() {
        return nbBureau;
    }

    public int getNbChaise() {
        return nbChaise;
    }

    public void setNbBureau(int nbBureau) {
        this.nbBureau = nbBureau;
    }

    public void setNbChaise(int nbChaise) {
        this.nbChaise = nbChaise;
    }

    public void setMaterialDao(MaterialDaoImpl materialDao) {
        this.materialDao = materialDao;
    }

    public void setListMateriel(listMaterielImpl listMateriel) {
        this.listMateriel = listMateriel;
    }




    /*GestionMaterielServiceImpl(MaterialDaoImpl materialDao) {
        this.materialDao = materialDao;
    }*/
    /*GestionMaterielServiceImpl(){
        this.materialDao =new MaterialDaoImpl(listMateriel);
        this.nbChaise = materialDao.getNbChaise();
        this.nbBureau = materialDao.getNbBureau();
    }*/

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


