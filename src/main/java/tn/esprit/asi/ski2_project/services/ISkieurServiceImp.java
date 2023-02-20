package tn.esprit.asi.ski2_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.asi.ski2_project.entities.Skieur;
import tn.esprit.asi.ski2_project.repositories.SkieurRepository;

import java.util.List;
@Service // yasnaa service bch yinjecti fiha l'instance li mawjouda f repo
public class ISkieurServiceImp implements ISkieurService{

    @Autowired //bch naaml instanciation maghir manaaml instance ++ singleton khatr mafamech classe f repo ana ken interface
    // +  injecter les dépendances(instance)
    private SkieurRepository skieurRepository ;


    @Override
    public void add(Skieur s) {
        skieurRepository.save(s);
    }

    @Override
    public Skieur update(Skieur s) {

       return skieurRepository.save(s);

    }

    @Override
    public List<Skieur> getAll() {
        return (List<Skieur>) skieurRepository.findAll();
    }

    @Override
    public Skieur getById(long id) {
        return skieurRepository.findById(id).orElse(null) ;
    }

    @Override
    public void remove(long id) {

         skieurRepository.deleteById(id);
    }
}
