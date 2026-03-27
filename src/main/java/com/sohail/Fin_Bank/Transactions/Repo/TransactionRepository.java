package com.sohail.Fin_Bank.Transactions.Repo;

import com.sohail.Fin_Bank.Account.Entity.Account;
import com.sohail.Fin_Bank.Transactions.Entity.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Page<Transaction> findByAccount_AccountNumber(String accountNumber, Pageable pageable);
    List<Transaction>findByAccount_AccountNumber(String accountNumber);

    List<Transaction> findByAccount(Account account);
}
