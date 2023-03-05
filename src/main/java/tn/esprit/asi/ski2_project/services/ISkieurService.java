package tn.esprit.asi.ski2_project.services;

import tn.esprit.asi.ski2_project.Ski2ProjectApplication;
import tn.esprit.asi.ski2_project.entities.Piste;
import tn.esprit.asi.ski2_project.entities.Skieur;

import java.util.List;

public interface ISkieurService {

    void add(Skieur s);

    Skieur update(Skieur s);

    List<Skieur> getAll();

    Skieur getById(long id);

    void remove(long id);


    Skieur assignSkieurToPiste(Long numSkieur, Long numPiste);

    Skieur assignSkieurToAbonnement(Long numSkieur, Long numAbon);
}
