package com.diagnoPlant.services;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diagnoPlant.models.Inscription;
import com.diagnoPlant.models.Role;
import com.diagnoPlant.repositories.InscriptionRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class InscriptionDetailsServiceImpl implements UserDetailsService{
    @Autowired
    private InscriptionRepository inscriptionRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) {
        Inscription inscription = inscriptionRepository.findByUsername(username);
        if (inscription == null) throw new UsernameNotFoundException(username);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Role role : inscription.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new org.springframework.security.core.userdetails.User(inscription.getUsername(), inscription.getPassword(), grantedAuthorities);
    }
}