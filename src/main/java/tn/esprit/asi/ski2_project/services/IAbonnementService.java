package tn.esprit.asi.ski2_project.services;

import tn.esprit.asi.ski2_project.entities.Abonnement;
import tn.esprit.asi.ski2_project.entities.Cours;

import java.util.List;

public interface IAbonnementService {
    void add(Abonnement a);

    Abonnement update(Abonnement a);

    List<Abonnement> getAll();

    Abonnement getById(long id);

    void remove(long id);
}
