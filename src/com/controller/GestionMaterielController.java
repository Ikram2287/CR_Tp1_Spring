package com.controller;

import com.modele.Bureau;
import com.modele.Chaise;
import com.modele.Materiel;
import com.service.api.GestionMaterielService;
import com.service.impl.GestionMaterielServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Component
public class GestionMaterielController {

    @Autowired
    private GestionMaterielService gestionMaterielService;

    public void listerMateriel() {
        gestionMaterielService.listerMateriel();
    }


    public void afficherMenu() {

        System.out.println("1- pour lister le matériel, entrer 1");
        System.out.println("2- pour ajouter un nouveau matériel, entrer 2");
        System.out.println("3- pour supprimer un materiel, entrer 3");
        System.out.println("4- pour modifier un materiel, entrer 4");
        System.out.println("0- pour sortir de l'application, entrer 0");
        Scanner scanner = new Scanner(System.in);
        String name;
        Integer id;
        String next = scanner.next();

        if ("0".equals(next)) {
            sortirDeLApplication();
        }
        else if ("1".equals(next)) {
            listerMateriel();
        }
        else if ("2".equals(next)) {
            System.out.println("Spécifiez le type du materiel");
            System.out.println("1- pour ajouter une chaise, entrer 1");
            System.out.println("2- pour ajouter un bureau, entrer 2");
            if ("1".equals(next)) {
                System.out.println("Entrez le nom du matériel");
                name = scanner.next();
                Chaise chaise = new Chaise(name);
            } else if ("2".equals(next)) {
                System.out.println("Entrez le nom du matériel");
                name = scanner.next();
                Bureau bureau = new Bureau(name);
            }
        }
        else if ("3".equals(next)) {
                System.out.println("Entrez le nom du matériel");
                name = scanner.next();
                gestionMaterielService.supprimerMateriel(name);

        }
        else if ("4".equals(next)) {
                System.out.println("Entrez le nom du matériel");
                name = scanner.next();
                System.out.println("Entrez le nom du matériel");
                id = scanner.nextInt();

            gestionMaterielService.modifierMateriel(id, name);

        }
        else {
            System.out.println("choix invalide");
        }
    }

    private void sortirDeLApplication() {
        System.exit(0);
    }

    public void setGestionMaterielService(GestionMaterielServiceImpl gestionMaterielService) {
    this.gestionMaterielService = gestionMaterielService;
    }
}
