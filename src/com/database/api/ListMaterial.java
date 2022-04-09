package com.database.api;

import com.modele.Materiel;

import java.util.ArrayList;

public interface ListMaterial {
    public ArrayList<Materiel> list = new ArrayList<>();
    public ArrayList<Materiel> getList();
}
