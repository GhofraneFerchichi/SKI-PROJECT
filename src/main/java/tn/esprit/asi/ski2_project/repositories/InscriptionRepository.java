package tn.esprit.asi.ski2_project.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski2_project.entities.Inscription;
import tn.esprit.asi.ski2_project.entities.Skieur;

public interface InscriptionRepository extends CrudRepository<Inscription, Long> {
}
