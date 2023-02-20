package tn.esprit.asi.ski2_project.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;
import java.util.Set;
import tn.esprit.asi.ski2_project.entities.Moniteur;
@Entity
@ToString
@Getter
@Setter
@Table(name = "Cours")
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    private Support support;
    private float prix;
    private int creneau;


    @OneToMany(mappedBy="cours")
    private List<Inscription> iscriptionList;



}
