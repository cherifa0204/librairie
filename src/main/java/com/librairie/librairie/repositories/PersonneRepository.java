package com.librairie.librairie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.librairie.librairie.entities.Person;



@Repository
public interface PersonneRepository extends JpaRepository<Person, Long>{

    
}