package com.diagnoPlant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diagnoPlant.models.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
Inscription findByUsername(String username);


    
}