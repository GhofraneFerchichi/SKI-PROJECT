package tn.esprit.asi.ski2_project.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
@Table(name = "Inscription")
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInscription;

    private int numSemaine;
    @ManyToOne
    private Cours cours;
    @ManyToOne
    private Skieur skieur;
}
