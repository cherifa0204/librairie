
package com.librairie.librairie.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.librairie.librairie.entities.Person;
import com.librairie.librairie.repositories.PersonneRepository;

@Service
public class PersonneService {
    @Autowired
    PersonneRepository personneRepository;


    public List<Person> getAllPersons(){
        List<Person> persons= personneRepository.findAll();
        return persons;

    }
     
    /**
     * @param id
     * @return
     */
    public Person getPerson(Long id){
        Person person = personneRepository.findById(id).get();
        return person;
    }
}
