package tn.esprit.asi.ski2_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.asi.ski2_project.entities.Inscription;
import tn.esprit.asi.ski2_project.repositories.InscriptionRepository;

import java.util.List;
@Service
public class IInscriptionServiceImp implements IInscriptionService{

    @Autowired
    InscriptionRepository inscriptionRepository;
    @Override
    public void add(Inscription i) {

        inscriptionRepository.save(i);
    }

    @Override
    public Inscription update(Inscription i) {
        return inscriptionRepository.save(i);
    }

    @Override
    public List<Inscription> getAll() {
        return (List<Inscription>) inscriptionRepository.findAll();
    }

    @Override
    public Inscription getById(long id) {
        return inscriptionRepository.findById(id).orElse(null) ;
    }

    @Override
    public void remove(long id) {

        inscriptionRepository.deleteById(id);
    }
}
