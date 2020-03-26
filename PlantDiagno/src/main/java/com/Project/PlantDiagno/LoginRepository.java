package com.Project.PlantDiagno;

import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository <Login, Long> {
   
    Login findById(String id);
	void delete(Long id);
	void update(Login login);
}