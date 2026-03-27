package com.sohail.Fin_Bank.auth_users.Dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class RegistrationRequest {

    private String firstName;
    private String lastName;
    @Email
    @NotBlank(message = "email is Required")
    private String email;
    private String password;
    private String confirmPassword;
    private List<String> roles;

}
