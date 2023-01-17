package com.example.demo;

import com.example.demo.model.Utilisateur;
import com.example.demo.repositories.NoteRepository;
import com.example.demo.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    NoteRepository noteRepository;

    @Autowired
    UtilisateurRepository utilisateurRepository;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("==========================================");
        System.out.println("=             Gestion de notes           =");
        System.out.println("==========================================");

    }




    /**
     * Faire le menu
     */
    public void Menu(){

    }
































































    /**
     *
     * @return le role de l'utilisateur qui s'est connécté
     */
    public  int Connexion(String user, String password){
        return 0;

    }














































    public  void SaisirNote(){




    }





















































    public void consulterNote(){


    }





































}
