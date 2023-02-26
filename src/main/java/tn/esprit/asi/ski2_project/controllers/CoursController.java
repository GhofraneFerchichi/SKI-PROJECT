package tn.esprit.asi.ski2_project.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski2_project.entities.Cours;
import tn.esprit.asi.ski2_project.entities.Inscription;
import tn.esprit.asi.ski2_project.services.ICoursService;
import tn.esprit.asi.ski2_project.services.IInscriptionService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/cours")
public class CoursController {


    @Autowired
    private ICoursService iCoursService;

    @PostMapping
    public void add(@RequestBody Cours c){

        iCoursService.add(c);
    }

    @PutMapping
    public Cours update(@RequestBody Cours c){
        return iCoursService.update(c);
    }

    @GetMapping
    public List<Cours> getAll(){
        return (List<Cours>) iCoursService.getAll();
    }

    @GetMapping("/{id}")
    public Cours getById(@PathVariable long id){
        return iCoursService.getById(id);
    }
    @DeleteMapping("/{id}")
    void remove(@PathVariable long id)
    {iCoursService.remove(id);}
}
