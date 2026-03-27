package com.sohail.Fin_Bank.Account.Dtos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sohail.Fin_Bank.auth_users.Dtos.UserDto;
import com.sohail.Fin_Bank.auth_users.Entity.User;
import com.sohail.Fin_Bank.enums.AccountStatus;
import com.sohail.Fin_Bank.enums.AccountType;
import com.sohail.Fin_Bank.enums.Currency;
import jakarta.persistence.*;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.List;

@Data
public class AccountDTO {



        private Long id;

        @JsonBackReference
        private UserDto  user;

        private AccountStatus status;

        private String accountNumber;


        private BigDecimal balance= BigDecimal.ZERO;


        private AccountType accountType;


        private Currency currency;

        @JsonManagedReference
        private List<TransactionDTO> transactions;

        private LocalDate closedAt;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
    }

