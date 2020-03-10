package com.example.ExpertImage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ExpertImage.entities.Expert;

public interface ExpertRepository
      extends JpaRepository<Expert,Long>{
     
}
