package tn.esprit.asi.ski2_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.asi.ski2_project.entities.Moniteur;
import tn.esprit.asi.ski2_project.entities.Piste;
import tn.esprit.asi.ski2_project.repositories.MoniteurRepository;

import java.util.List;
@Service
public class IMoniteurServiceImp implements IMoniteurService{
    @Autowired
    private MoniteurRepository moniteurRepository;
    @Override
    public void add(Moniteur m) {

        moniteurRepository.save(m);
    }

    @Override
    public Moniteur update(Moniteur m) {
        return moniteurRepository.save(m);
    }

    @Override
    public List<Moniteur> getAll() {
        return (List<Moniteur>) moniteurRepository.findAll();
    }

    @Override
    public Moniteur getById(long id) {
        return moniteurRepository.findById(id).orElse(null) ;
    }

    @Override
    public void remove(long id) {

        moniteurRepository.deleteById(id);
    }
}
