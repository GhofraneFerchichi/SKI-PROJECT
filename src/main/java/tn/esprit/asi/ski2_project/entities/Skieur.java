package tn.esprit.asi.ski2_project.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Skieur")
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;

    @OneToMany(mappedBy="skieur")

    private List<Inscription> inscription;

    @ManyToMany
    private List<Piste> piste;

    @OneToOne
    private Abonnement abonnement;
}

