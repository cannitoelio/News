package com.coding.challenge.news.services;

import com.coding.challenge.news.models.entities.User;
import com.coding.challenge.news.models.forms.UserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    private UserService userService;

    public String register(UserForm userForm){
        //TODO
        User user = new User();
        user.setEmail(userForm.getEmail());
        user.setPassword(userForm.getPassword());
        return userService.signUp(user);
    }
}
