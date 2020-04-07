package com.diagnoPlant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.diagnoPlant.models.Login;

public interface LoginRepository extends JpaRepository <Login, Long> {
   
   
}