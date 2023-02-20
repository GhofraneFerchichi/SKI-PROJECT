package tn.esprit.asi.ski2_project.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski2_project.entities.Moniteur;
import tn.esprit.asi.ski2_project.entities.Skieur;

public interface MoniteurRepository extends CrudRepository<Moniteur, Long> {
}
