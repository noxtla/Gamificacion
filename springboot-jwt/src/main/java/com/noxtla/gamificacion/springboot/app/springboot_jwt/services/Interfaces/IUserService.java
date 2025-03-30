package com.noxtla.gamificacion.springboot.app.springboot_jwt.services.Interfaces;

import java.util.List;

import com.noxtla.gamificacion.springboot.app.springboot_jwt.models.User;

public interface IUserService {

    List<User> findAll ();
    User save (User user);
    boolean existByUsername (String username);

}
