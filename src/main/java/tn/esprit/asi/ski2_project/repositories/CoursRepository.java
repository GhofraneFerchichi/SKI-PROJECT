package tn.esprit.asi.ski2_project.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski2_project.entities.Cours;
import tn.esprit.asi.ski2_project.entities.Skieur;

public interface CoursRepository extends CrudRepository<Cours, Long> {
}
