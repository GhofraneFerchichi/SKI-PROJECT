package tn.esprit.asi.ski2_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.asi.ski2_project.entities.Piste;
import tn.esprit.asi.ski2_project.entities.Skieur;
import tn.esprit.asi.ski2_project.repositories.PisteRepository;

import java.util.List;
@Service
public class IPisteServiceImp implements IPisteService{

    @Autowired
    private PisteRepository pisteRepository;
    @Override
    public void add(Piste p) {

         pisteRepository.save(p);
    }

    @Override
    public Piste update(Piste p) {
        return pisteRepository.save(p);
    }

    @Override
    public List<Piste> getAll() {
        return (List<Piste>) pisteRepository.findAll();
    }

    @Override
    public Piste getById(long id) {
        return pisteRepository.findById(id).orElse(null) ;
    }

    @Override
    public void remove(long id) {

        pisteRepository.deleteById(id);
    }
}