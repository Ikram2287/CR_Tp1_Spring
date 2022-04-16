package com.database.impl;

import com.database.api.MaterialDao;
import com.modele.Materiel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class MaterialDaoImpl implements MaterialDao {
    private int nbBureau, nbChaise;


    public listMaterielImpl listMateriel;

    //@PostConstruct
    public void init() {
        System.out.println("post construct method");
    }

    public MaterialDaoImpl(listMaterielImpl listMaterielImpl) {
        this.listMateriel = listMaterielImpl;
    }

    @Override
    public void listerMaterielDAO() {
        ArrayList<Materiel> list = listMateriel.getList();
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i).getName());
        }

    }

    @Override
    public Materiel rechercheParNameDAO(String name) {
        for(int i = 0; i<listMateriel.getList().size(); i++){
            if (listMateriel.getList().get(i).getName().equals(name))
                return listMateriel.getList().get(i); }

        return null;
    }

    @Override
    public void ajouterMaterielDAO(Materiel materiel) {
        listMateriel.materiels.add(materiel);
    }

    @Override
    public void supprimerMaterielDAO(String name) {
        //Materiel materiel = rechercheParNameDAO(name);
        for(int i = 0; i<listMateriel.getList().size(); i++){
            if (listMateriel.getList().get(i).getName().equals(name))
                 listMateriel.getList().remove(i); }
    }

    @Override
    public void modifierMaterielDAO(Integer id,String name) {
        for(int i = 0; i <listMateriel.getList().size() ; i++){
            if( listMateriel.getList().get(i).getId().equals(id))
                listMateriel.getList().get(i).setName(name);
        }
    }

    public int getNbBureau() {
        for (int i = 0; i < listMateriel.getList().size(); i++) {
            if (listMateriel.getList().get(i).getClass().getName().equals("class.com.modele.Bureau")) {
                nbBureau++;
            }
        }
        return nbBureau;
    }
    public int getNbChaise() {
        for (int i = 0; i < listMateriel.getList().size(); i++) {
            if (listMateriel.getList().get(i).getClass().getName().equals("class.com.modele.Chaise")) {
                nbChaise++;
            }
        }
        return nbChaise;

    }
}
