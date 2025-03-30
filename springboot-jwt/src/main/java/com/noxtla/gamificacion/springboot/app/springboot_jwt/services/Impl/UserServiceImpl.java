package com.noxtla.gamificacion.springboot.app.springboot_jwt.services.Impl;
import java.util.List;

import com.noxtla.gamificacion.springboot.app.springboot_jwt.models.User;
import com.noxtla.gamificacion.springboot.app.springboot_jwt.services.Interfaces.IUserService;

public class UserServiceImpl implements IUserService{

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public User save(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public boolean existByUsername(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existByUsername'");
    }

}
