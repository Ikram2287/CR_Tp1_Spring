package com.database;

import com.modele.Bureau;
import com.modele.Chaise;
import com.modele.Materiel;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ListeMateriel extends Materiel{
    List<Materiel> materiels;

    public ListeMateriel(){
        Bureau b = new Bureau("Bureau1");
        Bureau b1 = new Bureau("Bureau2");

        Chaise c = new Chaise("chaise1");
        Chaise c1 = new Chaise("chaise2");
        materiels.add(b);
        materiels.add(b1);
        materiels.add(c);
        materiels.add(c1);
    }
    public void ajouterMateriel(Materiel materiel) {
        materiels.add(materiel);
    }
    public void supprimerMat(Materiel materiel) {
        materiels.remove(materiel);
    }





}
