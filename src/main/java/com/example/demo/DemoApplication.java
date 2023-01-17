package com.example.demo;

import com.example.demo.model.Note;
import com.example.demo.model.Utilisateur;
import com.example.demo.repositories.NoteRepository;
import com.example.demo.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

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

    Menu();



    }




    /**
     * Faire le menu
     */
    public void Menu(){

        System.out.println("==========================================");
        System.out.println("=             Gestion de notes           =");
        System.out.println("==========================================");
        System.out.println("veuiller saisir votre nom utilsateur\n");
        Scanner scanner  = new Scanner(System.in);
        String username  = scanner.nextLine();
        System.out.println("veuiller saisir votre mot de passe\n");
        String password  = scanner.nextLine();
        Map<String,Integer> res = connexion(username,password);
        saisirNote();



    }





















































































    /**
     *
     * @return le role de l'utilisateur qui s'est connécté
     */
    public Map<String,Integer> connexion(String user, String password) {
        Map<String, Integer> roleUser = new HashMap<>();
        List<Utilisateur> utilisateurs = new ArrayList<>();
        Utilisateur userN = utilisateurRepository.findUtilisateurByUsername(user);
        if (userN != null) {
            if (userN.getPassword().equals(password)) {
                System.out.println("Connexion réussi avec succès");
                roleUser.put(userN.getUsername(), userN.getRole());
            } else {
                System.out.println("Identifiant incorretes");
            }
            ;
        } else {
            System.out.println("indentifiant incorrect");
        }

    return roleUser;

    }














































    public void saisirNote(){
        Utilisateur utilisateur = new Utilisateur();
        utilisateur = utilisateurRepository.findById(1).get();
        System.out.println("================="+utilisateur.getRole());
            //si admin
            if (utilisateur.getRole() == 1) {
                Scanner in = new Scanner(System.in);
                System.out.println("Veuillez saisir votre notre note\n");
                String note = in.nextLine();
                System.out.println("Veuillez saisir le commentaire\n");
                String commentaire = in.nextLine();
                System.out.println("Veuillez saisir la matière\n");
                String matiere = in.nextLine();

                Note note1 = new Note();
                note1.setNote(note);
                note1.setCommentaire(commentaire);
                note1.setMatiere(matiere);

                noteRepository.save(note1);

            }
            else{
                System.out.println("Vous n'etes pas autorisé à saisir des notes");

        }

    }























































    public void consulterNote(){


    }





































}
