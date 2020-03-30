package com.diagnoPlant.controllers;

/**
 * 
 */

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

/**
 * @author hp
 *
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diagnoPlant.models.Inscription;
import com.diagnoPlant.repositories.UserRepository;
/**
 * @author hp
 * @param <userRepository>
 *
 */
@RestController
public class InscriptionControleur<userRepository> {
	
	   @Autowired 
		private UserRepository userRepository;
	
	   
	   @GetMapping(path="Inscription/id") // 
	   public Optional<Inscription> getOne(@PathVariable(name="id")Long id){
           return userRepository.findById(id);
	   }
	    	    
	   
	   @PostMapping(path="Inscription")
	   public Inscription save(@RequestBody Inscription Inscription){
		   return userRepository.save(Inscription);
       }
	   @PutMapping(path="Inscription/{id}")
	   public Inscription update(@PathVariable(name="id")Long id, @RequestBody Inscription inscription){
	   inscription.setId(id);
       return userRepository.save(inscription);
	   }
	   @DeleteMapping(path="Inscription/{id}")
	   public void delete(@PathVariable("id")Long id) {
		   userRepository.delete(id);
}
}