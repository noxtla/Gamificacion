package com.noxtla.gamificacion.springboot.app.springboot_jwt.Repository;

import java.util.Optional;

import javax.management.relation.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);
}
