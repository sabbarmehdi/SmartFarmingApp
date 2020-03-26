package com.Project.PlantDiagno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceInscription {

	private UserRepository userRepository;
	
	@Autowired
    public ServiceInscription(UserRepository userRepository) { 
      this.userRepository = userRepository;
    }
	public Inscription findById(String Id) {
		return userRepository.findById(Id);	
		}
	public void save(Inscription inscription) {
		userRepository.save(inscription);
	}
	public void delete(Inscription inscription) {
		userRepository.delete(inscription);
	}
	public void update(Inscription inscription) {
		userRepository.update(inscription);
	}
	
}




