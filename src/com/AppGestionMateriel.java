package com;

import com.controller.GestionMaterielController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SuppressWarnings("all")
public class AppGestionMateriel {
    private static final ApplicationContext APPLICATION_CONTEXT;

    static { // bloc static pour initilialisation
        APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("/beans/app-context.xml","/beans/database-context.xml");
    }

    public static void main(String[] args) {
        final GestionMaterielController gestionMaterielController = APPLICATION_CONTEXT.getBean(GestionMaterielController.class);
        Scanner scanner = new Scanner(System.in);
        int next =scanner.nextInt();

        while (true) { // pour que l'appliation tourne jusqu'à la demande de l'utilisateur de l'arrêter
            gestionMaterielController.afficherMenu();
        }


    }
}