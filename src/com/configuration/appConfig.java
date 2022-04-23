package com.configuration;

import com.controller.GestionMaterielController;
import com.database.api.MaterialDao;
import com.database.impl.MaterialDaoImpl;
import com.database.impl.listMaterielImpl;
import com.service.impl.GestionMaterielServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {
    @Bean
    public GestionMaterielController gestionMaterielControllerBean(GestionMaterielServiceImpl gestionMaterielService){
        GestionMaterielController ext = new GestionMaterielController();
        ext.setGestionMaterielService(gestionMaterielService);
        return ext;
    }
    @Bean
    public GestionMaterielServiceImpl gestionMaterielServiceBean(listMaterielImpl listMateriel, MaterialDaoImpl materialDao, int nbChaise ,int nbBureau){
        GestionMaterielServiceImpl ext = new GestionMaterielServiceImpl();
        ext.setListMateriel(listMateriel);
        ext.setNbBureau(nbBureau);
        ext.setNbChaise(nbChaise);
        ext.setMaterialDao(materialDao);
        return ext;
    }

    @Bean
    public MaterialDaoImpl materialDaoBean(){
        return new MaterialDaoImpl(new listMaterielImpl());
    }
    @Bean
    public listMaterielImpl listMaterielBean(){
        return new listMaterielImpl();
    }

}
