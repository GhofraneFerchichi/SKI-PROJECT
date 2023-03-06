package tn.esprit.asi.ski2_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.asi.ski2_project.entities.Abonnement;
import tn.esprit.asi.ski2_project.entities.Skieur;
import tn.esprit.asi.ski2_project.entities.TypeAbonnement;
import tn.esprit.asi.ski2_project.repositories.AbonnementRepository;
import tn.esprit.asi.ski2_project.repositories.SkieurRepository;

import java.util.List;
import java.util.Set;

@Service
public class IAbonnementServiceImp implements IAbonnementService{
    @Autowired
    private AbonnementRepository abonnementRepository;
    @Autowired
    private SkieurRepository skieurRepository;
    @Override
    public void add(Abonnement a) {

        abonnementRepository.save(a);
    }

    @Override
    public Abonnement update(Abonnement a) {
        return abonnementRepository.save(a);
    }

    @Override
    public List<Abonnement> getAll() {
        return (List<Abonnement>) abonnementRepository.findAll();
    }

    @Override
    public Abonnement getById(long id) {
        return abonnementRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(long id) {

        abonnementRepository.deleteById(id);
    }
   @Override
    public Skieur assignSkieurtoAbonnement(long numSkieur, long numAbon) {
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Abonnement abonnement = abonnementRepository.findById(numAbon).orElse(null);
        return  skieurRepository.save(skieur);
    }

    @Override
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement type) {
        return abonnementRepository.findByTypeAbon(type);
    }
}
