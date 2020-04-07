package com.diagnoPlant.services;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.diagnoPlant.models.Inscription;
import com.diagnoPlant.repositories.RoleRepository;

	@Service
	public class InscriptionServiceImpl implements InscriptionService {
	    @Autowired
	    private com.diagnoPlant.repositories.InscriptionRepository inscriptionRepository;
	    @Autowired
	    private RoleRepository roleRepository;
	    @Autowired
	    private BCryptPasswordEncoder bCryptPasswordEncoder;

	    @Override
	    public void save(Inscription inscription) {
	    	inscription.setPassword(bCryptPasswordEncoder.encode(inscription.getPassword()));
	    	inscription.setRoles(new HashSet<>(roleRepository.findAll()));
	        inscriptionRepository.save(inscription);
	    }

	    @Override
	    public Inscription findByUsername(String username) {
	        return inscriptionRepository.findByUsername(username);
	    }

	}


