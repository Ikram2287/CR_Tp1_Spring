package com;

import com.controller.GestionMaterielController;
import com.listeners.ApplicationPublisher;
import com.listeners.EventType;
import com.listeners.MyEvent;
import com.modele.Bureau;
import com.modele.Chaise;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SuppressWarnings("all")
public class AppGestionMateriel {
    private static final ApplicationContext APPLICATION_CONTEXT;

    static { // bloc static pour initilialisation
        //APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("/beans/*-context.xml");
        APPLICATION_CONTEXT = new AnnotationConfigApplicationContext("/configuration/appConfig.java");
    }

    public static void main(String[] args) {
        final GestionMaterielController gestionMaterielController = APPLICATION_CONTEXT.getBean(GestionMaterielController.class);
        Scanner scanner = new Scanner(System.in);
        int next =scanner.nextInt();

        final ApplicationPublisher publisher = APPLICATION_CONTEXT.getBean(ApplicationPublisher.class);
        publisher.publish(new MyEvent<>(new Bureau("desky"), EventType.ADD));


        while (true) { // pour que l'appliation tourne jusqu'à la demande de l'utilisateur de l'arrêter
            gestionMaterielController.afficherMenu();
        }


    }
}