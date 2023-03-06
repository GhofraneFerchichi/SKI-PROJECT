package tn.esprit.asi.ski2_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.asi.ski2_project.entities.Abonnement;
import tn.esprit.asi.ski2_project.entities.Piste;
import tn.esprit.asi.ski2_project.entities.Skieur;
import tn.esprit.asi.ski2_project.entities.TypeAbonnement;
import tn.esprit.asi.ski2_project.repositories.AbonnementRepository;
import tn.esprit.asi.ski2_project.repositories.PisteRepository;
import tn.esprit.asi.ski2_project.repositories.SkieurRepository;

import java.util.ArrayList;
import java.util.List;
@Service // yasnaa service bch yinjecti fiha l'instance li mawjouda f repo
public class ISkieurServiceImp implements ISkieurService{

    @Autowired //bch naaml instanciation maghir manaaml instance ++ singleton khatr mafamech classe f repo ana ken interface
    // +  injecter les dépendances(instance)
    private SkieurRepository skieurRepository ;
    @Autowired
    private PisteRepository pisteRepository;

    @Autowired
    private AbonnementRepository abonnementRepository;

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

    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null); //recuperation des objets
        Assert.notNull(skieur,"skieur not found"); //houni ken mal9ach skieur yrajaali msg
        Piste piste = pisteRepository.findById(numPiste).orElse(null); //recuperation des objets
        Assert.notNull(skieur,"piste not found");
       // List<Piste> pistes = skieur.getPiste();
        //pistes.add(piste);
        //skieur.setPiste(pistes);
        // on peut aussi utiliser ci dessous
        skieur.getPiste().add(piste);
        return skieurRepository.save(skieur);
    }
  public  Skieur assignSkieurToAbonnement(Long numSkieur, Long numAbon){
      Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
      Assert.notNull(skieur,"not found");
      Abonnement abonnement = abonnementRepository.findById(numAbon).orElse(null);
      Assert.notNull(abonnement,"not found");
      skieur.setAbonnement(abonnement);
      return skieurRepository.save(skieur);
  }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {

          return    skieurRepository.findByAbonnementTypeAbon(typeAbonnement);

    }


}
