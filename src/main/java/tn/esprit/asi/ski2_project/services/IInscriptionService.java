package tn.esprit.asi.ski2_project.services;

import tn.esprit.asi.ski2_project.entities.Inscription;
import tn.esprit.asi.ski2_project.entities.Moniteur;

import java.util.List;

public interface IInscriptionService {
    void add(Inscription i);

    Inscription update(Inscription i);

    List<Inscription> getAll();

    Inscription getById(long id);

    void remove(long id);
}
