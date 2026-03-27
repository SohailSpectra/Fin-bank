package com.sohail.Fin_Bank.Transactions.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sohail.Fin_Bank.enums.TransactionType;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionsRequest {

    private TransactionType transactionType;
    private BigDecimal amount;
    private String accountNumber;
    private String description;

    private String destinationAccountNumber;


}
