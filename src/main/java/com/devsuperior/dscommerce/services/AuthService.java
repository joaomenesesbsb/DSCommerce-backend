package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.entities.User;
import com.devsuperior.dscommerce.exeptions.ForbiddenExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserService userService;

    public void validateSelfOrAdmin(Long userId) {

        User me = userService.authenticated();
        if (userId != me.getId() && !me.hasRole("ROLE_ADMIN")){
            throw new ForbiddenExeption("Access denied");
        }
    }
}
