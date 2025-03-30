package com.noxtla.gamificacion.springboot.app.springboot_jwt.repositories;

import com.noxtla.gamificacion.springboot.app.springboot_jwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}