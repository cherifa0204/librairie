package com.librairie.librairie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.librairie.librairie.entities.Person;
import com.librairie.librairie.services.PersonneService;

@RestController
@RequestMapping("/persons")
public class PersonController {

    // @GetMapping("/person")
    // @ResponseBody
    // public String getName() { return "person" ;}



    @Autowired
    PersonneService service_person;
    
    @GetMapping("/liste")
    public ResponseEntity<List<Person>> getAllPersons() {  
        List<Person> personnes = service_person.getAllPersons();
        return ResponseEntity.ok(personnes);
    }
    // @GetMapping("/person/{id}")
    // public ResponseEntity<Person> getPerson(@PathVariable Long id) {
    //     return service_person.getPerson(Long id);
    // }
    
}
