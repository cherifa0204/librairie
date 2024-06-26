package com.librairie.librairie.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.librairie.librairie.entities.Employer;


@Repository
public interface EployerRepository extends JpaRepository<Employer, Long> {
    
}
