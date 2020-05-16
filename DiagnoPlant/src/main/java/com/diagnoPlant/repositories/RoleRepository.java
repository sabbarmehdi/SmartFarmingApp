package com.diagnoPlant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diagnoPlant.models.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);

}