package com.diagnoPlant.controllers;

/**
 * 
 */

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diagnoPlant.models.Login;
import com.diagnoPlant.repositories.LoginRepository;

/**
 * @author hp
 *
 */

@RestController
public class LoginControler {
	
	@Autowired
	private LoginRepository loginRepository;
	@GetMapping(path="Login/id") // 
	   public Optional<Login> getOne(@PathVariable(name="id")Long id){
        return loginRepository.findById(id);
	   }
	    	    
	   
	   @PostMapping(path="Login")
	   public Login save(@RequestBody Login login){
		   return loginRepository.save(login);
    }
	   @PutMapping(path="Login/{id}")
	   public Login update(@PathVariable(name="id")Long id, @RequestBody Login login){
	   Login.setId(id);
    return loginRepository.save(login);
	   }
	   @DeleteMapping(path="Login/{id}")
	   public void delete(@PathVariable("id")Long id) {
		   loginRepository.delete(id);
}
}



