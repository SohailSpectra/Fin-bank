package com.sohail.Fin_Bank.auth_users.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sohail.Fin_Bank.Account.Entity.Account;
import com.sohail.Fin_Bank.role.Entity.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String firstName;
    private  String lastName;
    @Email
    @Column(unique = true)
    @NotBlank(message = "Email is Required")
    private  String email;

    private  String password;
    private  String profilePictureurl;
    private Boolean active =true;

    @ManyToMany(fetch = FetchType.EAGER)
            @JoinTable(
                    name = "user_roles",
                    joinColumns = @JoinColumn( name ="user_id"),
                    inverseJoinColumns = @JoinColumn(name = "role_id")
            )
    List<Role> roles;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Account> accounts;

    private LocalDateTime createdAt =  LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

}
