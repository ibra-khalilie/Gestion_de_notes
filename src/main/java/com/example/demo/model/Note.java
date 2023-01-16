package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Note {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "note")
    private String note;

    @Column(name = "matiere")
    private String matiere;

    @Column(name = "commentaire")
    private String commentaire;

    @Column(name = "moyenne")
    private String moyenne;


}
