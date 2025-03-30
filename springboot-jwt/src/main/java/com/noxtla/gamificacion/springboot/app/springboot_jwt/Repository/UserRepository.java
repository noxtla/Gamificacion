package com.noxtla.gamificacion.springboot.app.springboot_jwt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noxtla.gamificacion.springboot.app.springboot_jwt.Models.UsersJWT;

import java.util.Optional;



public interface UserRepository extends JpaRepository<UsersJWT,Long>{

    Optional<UsersJWT> findfindByUsername(String name);
    boolean existByUserName (String username);

}
