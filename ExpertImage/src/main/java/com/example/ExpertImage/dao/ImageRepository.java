package com.example.ExpertImage.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.ExpertImage.entities.Image;

public interface ImageRepository 
extends JpaRepository<Image,Long>{

}
