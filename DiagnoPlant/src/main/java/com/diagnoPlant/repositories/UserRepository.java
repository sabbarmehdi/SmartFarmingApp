package com.diagnoPlant.repositories;
import org.springframework.data.repository.CrudRepository;

import com.diagnoPlant.models.Inscription;

public interface UserRepository extends CrudRepository <Inscription, Long> {

    Inscription findById(String id);
	void delete(Long id);
	void update(Inscription inscription);
}
