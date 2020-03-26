package com.Project.PlantDiagno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LoginService {

		private LoginRepository loginRepository;
		
		@Autowired
	    public LoginService(LoginRepository loginRepository) { 
	      this.loginRepository = loginRepository;
	    }
		public Login findById(String Id) {
			return loginRepository.findById(Id);	
			}
		public void save(Login login) {
			loginRepository.save(login);
		}
		public void delete(Login login) {
			loginRepository.delete(login);
		}
		public void update(Login login) {
			loginRepository.update(login);
		}

}
