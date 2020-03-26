package com.Project.PlantDiagno;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <Inscription, Long> {

    Inscription findById(String id);
	void delete(Long id);
	void update(Inscription inscription);
}
