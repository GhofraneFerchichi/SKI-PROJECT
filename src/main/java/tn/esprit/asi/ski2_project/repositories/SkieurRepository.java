package tn.esprit.asi.ski2_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski2_project.entities.Skieur;
import tn.esprit.asi.ski2_project.entities.TypeAbonnement;
import tn.esprit.asi.ski2_project.entities.TypeCours;

import java.util.List;


public interface SkieurRepository extends CrudRepository<Skieur, Long> {

    List<Skieur> findByAbonnementTypeAbon(TypeAbonnement typeAbonnement);
    List<Skieur>findByInscriptionCoursTypeCours(TypeCours typeCours);
}
