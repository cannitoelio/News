package com.coding.challenge.news.models.forms;

import com.coding.challenge.news.enums.UserRole;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Collections;

@Data
public class UserForm {
    @NotNull
    @Email
    private String email;
    @NotNull
    @Length(min = 7, max = 100)
    private String password;
}
