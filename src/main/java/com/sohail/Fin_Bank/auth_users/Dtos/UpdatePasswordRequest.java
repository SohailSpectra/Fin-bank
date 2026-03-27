package com.sohail.Fin_Bank.auth_users.Dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdatePasswordRequest {

    @NotBlank(message = "old password is required")
    private String oldpassword;

    @NotBlank(message = "New password is Required")
    private String newpassword;

}
