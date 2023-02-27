package tn.esprit.asi.ski2_project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@Entity
@ToString
@Getter @Setter

@Table(name = "Piste")
public class Piste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;

    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private int longeur;
    private int pente;

    public long getNumPiste() {
        return numPiste;
    }

    public void setNumPiste(long numPiste) {
        this.numPiste = numPiste;
    }

    public String getNomPiste() {
        return nomPiste;
    }

    public void setNomPiste(String nomPiste) {
        this.nomPiste = nomPiste;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public int getPente() {
        return pente;
    }

    public void setPente(int pente) {
        this.pente = pente;
    }

    public List<Skieur> getSkieur() {
        return skieur;
    }

    public void setSkieur(List<Skieur> skieur) {
        this.skieur = skieur;
    }


    @ManyToMany(mappedBy = "piste")
    @JsonIgnore
    private List<Skieur> skieur;
}
