package com.diagnoPlant.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diagnoPlant.Models.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image,Long>{

}