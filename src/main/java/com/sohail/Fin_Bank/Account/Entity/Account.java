package com.sohail.Fin_Bank.Account.Entity;

import com.sohail.Fin_Bank.auth_users.Entity.User;
import com.sohail.Fin_Bank.enums.AccountStatus;
import com.sohail.Fin_Bank.enums.AccountType;
import com.sohail.Fin_Bank.enums.Currency;
import jakarta.persistence.*;
import jakarta.transaction.Transaction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,nullable = false,length = 15)
    private String accountNumber;

    @Column(nullable = false,precision = 19,scale = 2)
    private BigDecimal balance= BigDecimal.ZERO;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountType accountType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @OneToMany(mappedBy = "account",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Transactions> transactions= new ArrayList<>();

    private LocalDate closedAt;
    private LocalDateTime createdAt=LocalDateTime.now();
    private LocalDateTime updatedAt;

}
