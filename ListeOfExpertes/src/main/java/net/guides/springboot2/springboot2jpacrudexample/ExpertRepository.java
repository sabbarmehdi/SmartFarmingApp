package net.guides.springboot2.springboot2jpacrudexample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ExpertRepository extends JpaRepository<Expert, Long> {
	List<Expert> findByLastName(String lastName);

	  Expert findById(long id);
}
