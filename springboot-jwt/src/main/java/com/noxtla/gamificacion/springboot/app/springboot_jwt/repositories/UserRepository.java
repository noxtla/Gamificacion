package com.noxtla.gamificacion.springboot.app.springboot_jwt.repositories;

import com.noxtla.gamificacion.springboot.app.springboot_jwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
}