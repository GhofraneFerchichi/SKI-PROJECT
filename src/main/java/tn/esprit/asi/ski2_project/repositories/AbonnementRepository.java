package tn.esprit.asi.ski2_project.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski2_project.entities.Abonnement;
import tn.esprit.asi.ski2_project.entities.Skieur;
import tn.esprit.asi.ski2_project.entities.TypeAbonnement;

import java.util.Set;

public interface AbonnementRepository extends CrudRepository<Abonnement, Long> {
    Set<Abonnement> findByTypeAbon(TypeAbonnement typeAbonnement);
}
