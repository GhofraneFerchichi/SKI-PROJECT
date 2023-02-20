package tn.esprit.asi.ski2_project.controllers;

import lombok.AllArgsConstructor;
import org.hibernate.Remove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski2_project.entities.Skieur;
import tn.esprit.asi.ski2_project.services.ISkieurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skieur")

public class SkieurController {

    @Autowired
    private ISkieurService iSkieurService;

@PostMapping("/add")
    public void add(@RequestBody Skieur s){

        iSkieurService.add(s);

    }
@PutMapping("/update")
   public Skieur update(@RequestBody Skieur s){
     return   iSkieurService.update(s);
    }
@GetMapping
  public   List<Skieur> getAll(){
        return iSkieurService.getAll();
    }
    @PostMapping("/{id}")
   public Skieur getById(@PathVariable  long id){
        return iSkieurService.getById(id);
    }
    @DeleteMapping("/{id}")
  public   void remove(@PathVariable  long id){
        iSkieurService.remove(id);
    }


    }

