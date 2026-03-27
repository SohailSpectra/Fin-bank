package com.sohail.Fin_Bank.auth_users.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetCode extends JpaRepository<PasswordResetCode,Long> {
    Optional<PasswordResetCode> findByCode(String code);
    void deleteUserById(Long userid);

}
