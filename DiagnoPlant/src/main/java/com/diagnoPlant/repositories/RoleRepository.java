package com.diagnoPlant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diagnoPlant.models.Role;

public interface RoleRepository extends JpaRepository <Role, Long>  {

}
