package com.example.demo.repositories;

import com.example.demo.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

    Utilisateur findUtilisateurByUsername(String username);

    Utilisateur findUtilisateursByPassword(String password);
}
