package com.diagnoPlant.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diagnoPlant.Models.Image;


public interface ImageRepository 
extends JpaRepository<Image,Long>{

}