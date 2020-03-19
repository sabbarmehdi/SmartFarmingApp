package com.diagnoPlant.Repositorys;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diagnoPlant.Models.MaladiePlante;

public interface MaladiePlanteRepository extends JpaRepository<MaladiePlante, Long> {

	List<MaladiePlante> findByNomMaladie(String n);



}
