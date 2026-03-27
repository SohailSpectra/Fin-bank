package com.sohail.Fin_Bank.Transactions.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sohail.Fin_Bank.Account.Dtos.AccountDTO;
import com.sohail.Fin_Bank.Account.Entity.Account;
import com.sohail.Fin_Bank.enums.TransactionStatus;
import com.sohail.Fin_Bank.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TransactionDTO {


    private Long id;

    private BigDecimal amount;

    private TransactionType type;

    private LocalDateTime transactionDate;

    private String description;


    private TransactionStatus status;
    @JsonBackReference
    private AccountDTO account;

    //transfer
    private String sourceAccount;
    private String destinationAccount;

}
