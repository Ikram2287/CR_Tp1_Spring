package com.modele;

public abstract class Materiel {
    private String name;
    private Integer id;


    public Integer getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
