package tn.esprit.asi.ski2_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski2_project.entities.Piste;

public interface PisteRepository extends CrudRepository<Piste,Long> {

}
