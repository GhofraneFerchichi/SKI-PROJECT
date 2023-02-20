package tn.esprit.asi.ski2_project.services;

import tn.esprit.asi.ski2_project.entities.*;

import java.util.List;

public interface IPisteService {
    void add(Piste p);

    Piste update(Piste p);

    List<Piste> getAll();

    Piste getById(long id);

    void remove(long id);



}
