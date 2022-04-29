package com.coding.challenge.news.restcontrollers;

import com.coding.challenge.news.models.forms.UserForm;
import com.coding.challenge.news.services.RegistrationService;
import com.coding.challenge.news.costants.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(Paths.URL_REGISTRATION )
public class AutheticationRestController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody @Valid UserForm registrationForm) {
        return registrationService.register(registrationForm);
    }
}
