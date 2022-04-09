package com.database.impl;

import com.database.api.ListMaterial;
import com.modele.Bureau;
import com.modele.Chaise;
import com.modele.Materiel;

import java.util.ArrayList;
import java.util.List;

public class listMaterielImpl implements ListMaterial {
    ArrayList<Materiel> materiels = new ArrayList<>(1);


    @Override
    public ArrayList<Materiel> getList() {
        return materiels;
    }

    public listMaterielImpl(){
        Bureau b = new Bureau("Bureau1");
        Bureau b1 = new Bureau("Bureau2");

        Chaise c = new Chaise("chaise1");
        Chaise c1 = new Chaise("chaise2");
        materiels.add(b);
        materiels.add(b1);
        materiels.add(c);
        materiels.add(c1);
    }
}
