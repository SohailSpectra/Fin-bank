package com.sohail.Fin_Bank.auth_users.Repo;

import com.sohail.Fin_Bank.auth_users.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String Email);
}
