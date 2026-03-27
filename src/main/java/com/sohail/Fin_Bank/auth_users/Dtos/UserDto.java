package com.sohail.Fin_Bank.auth_users.Dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sohail.Fin_Bank.Account.Dtos.AccountDTO;
import com.sohail.Fin_Bank.role.Entity.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {




        private Long id;
        private  String firstName;
        private  String lastName;

        private  String email;

        @JsonIgnore
        private  String password;
        private  String profilePictureurl;
        private Boolean active ;

        List<Role> roles;

        @JsonManagedReference
        private List<AccountDTO> accounts;

        private LocalDateTime createdAt =  LocalDateTime.now();
        private LocalDateTime updatedAt = LocalDateTime.now();
    }

