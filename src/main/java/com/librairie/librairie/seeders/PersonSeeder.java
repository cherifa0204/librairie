/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.librairie.librairie.seeders;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.librairie.librairie.entities.Person;
import com.librairie.librairie.repositories.PersonneRepository;


/**
 *
 * @author cherifa
 */

@Component
public class PersonSeeder implements CommandLineRunner {
    @Autowired
    PersonneRepository personneRepository;

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub 
        Person p1=new Person("tchabana","hafiz","90154520");
        //save p1
        personneRepository.save(p1);
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    
}
