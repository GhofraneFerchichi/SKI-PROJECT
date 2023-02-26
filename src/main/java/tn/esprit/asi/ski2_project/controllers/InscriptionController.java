package tn.esprit.asi.ski2_project.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski2_project.entities.Inscription;
import tn.esprit.asi.ski2_project.entities.Piste;
import tn.esprit.asi.ski2_project.services.IInscriptionService;
import tn.esprit.asi.ski2_project.services.IPisteService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/inscri")
public class InscriptionController {

    @Autowired
    private IInscriptionService iInscriptionService;

    @PostMapping
    public void add(@RequestBody Inscription i){

        iInscriptionService.add(i);
    }

    @PutMapping
    public Inscription update(@RequestBody Inscription i){
        return iInscriptionService.update(i);
    }

    @GetMapping
    public List<Inscription> getAll(){
        return (List<Inscription>) iInscriptionService.getAll();
    }

    @GetMapping("/{id}")
    public Inscription getById(@PathVariable long id){
        return iInscriptionService.getById(id);
    }
    @DeleteMapping("/{id}")
    void remove(@PathVariable long id)
    {iInscriptionService.remove(id);}


}
