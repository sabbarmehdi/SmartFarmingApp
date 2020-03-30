package com.diagnoPlant.repositories;

import org.springframework.data.repository.CrudRepository;

import com.diagnoPlant.models.Login;

public interface LoginRepository extends CrudRepository <Login, Long> {
   
    Login findById(String id);
	void delete(Long id);
	void update(Login login);
}