package tn.esprit.asi.ski2_project.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "Skieur")
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;

    public long getNumSkieur() {
        return numSkieur;
    }

    public String getNomS() {
        return nomS;
    }

    public String getPrenomS() {
        return prenomS;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public List<Inscription> getInscription() {
        return inscription;
    }

    public List<Piste> getPiste() {
        return piste;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public void setNumSkieur(long numSkieur) {
        this.numSkieur = numSkieur;
    }

    public void setPrenomS(String prenomS) {
        this.prenomS = prenomS;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setInscription(List<Inscription> inscription) {
        this.inscription = inscription;
    }

    public void setPiste(List<Piste> piste) {
        this.piste = piste;
    }

    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    @Override
    public String toString() {
        return "Skieur{" +
                "numSkieur=" + numSkieur +
                ", nomS='" + nomS + '\'' +
                ", prenomS='" + prenomS + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", ville='" + ville + '\'' +
                ", inscription=" + inscription +
                ", piste=" + piste +
                ", abonnement=" + abonnement +
                '}';
    }

    @OneToMany(mappedBy="skieur")

    private List<Inscription> inscription;

    @ManyToMany
    private List<Piste> piste;

    @OneToOne
    private Abonnement abonnement;
}

