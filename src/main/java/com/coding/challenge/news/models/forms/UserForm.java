package com.coding.challenge.news.models.forms;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class UserForm {
    @NotNull
    @Email
    private String email;
    @NotNull
    @Length(min = 7, max = 100)
    private String password;
}
