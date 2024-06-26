package com.librairie.librairie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.librairie.librairie.entities.Achat;

@Repository
public interface AchatRepository extends JpaRepository<Achat, Long> {
    
}
