package com.sohail.Fin_Bank.auth_users.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PasswordResetDTO {

        private String email;
        private String Code;
        private String newPassword;


    }

