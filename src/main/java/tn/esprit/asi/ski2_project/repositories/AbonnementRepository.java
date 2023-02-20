package tn.esprit.asi.ski2_project.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski2_project.entities.Abonnement;
import tn.esprit.asi.ski2_project.entities.Skieur;

public interface AbonnementRepository extends CrudRepository<Abonnement, Long> {
}
