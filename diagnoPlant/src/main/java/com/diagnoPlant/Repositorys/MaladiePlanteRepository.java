package com.diagnoPlant.Repositorys;

import com.diagnoPlant.Models.MaladiePlante;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MaladiePlanteRepository extends JpaRepository<MaladiePlante, Long> {

	public Page<MaladiePlante> findByNomMaladieContains(String Chercher, Pageable pageable);
}