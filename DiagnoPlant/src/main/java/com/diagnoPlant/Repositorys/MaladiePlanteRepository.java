package com.diagnoPlant.Repositorys;

import com.diagnoPlant.Models.MaladiePlante;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;


public interface MaladiePlanteRepository extends JpaRepository<MaladiePlante, Long> {

//	
//	@Query("select m from MaladiePlante m where m.nomMaladie like :x")
//	public Page<MaladiePlante> findByDesignationContains(@Param("x")String chercher, Pageable pageable);
}