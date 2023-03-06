package tn.esprit.asi.ski2_project.services;

import tn.esprit.asi.ski2_project.entities.*;

import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    void add(Abonnement a);

    Abonnement update(Abonnement a);

    List<Abonnement> getAll();

    Abonnement getById(long id);

    void remove(long id);
    Set<Abonnement> getSubscriptionByType(TypeAbonnement type);
}
