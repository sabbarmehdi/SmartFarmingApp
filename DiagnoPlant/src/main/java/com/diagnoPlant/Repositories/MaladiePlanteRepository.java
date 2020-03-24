package com.diagnoPlant.Repositories;

import com.diagnoPlant.Models.MaladiePlante;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * This class extends all methods of JpaRepository
 * @author lahcen
 *
 */
public interface MaladiePlanteRepository extends JpaRepository<MaladiePlante, Long> {
	
	/**
	 * With this method you can search by name(nomMaladie)
	 * @author lahcen
	 * @param Chercher
	 * @param pageable
	 */
	public Page<MaladiePlante> findByNomMaladieContains(String Chercher, Pageable pageable);
}