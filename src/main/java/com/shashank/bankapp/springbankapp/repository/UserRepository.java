package com.shashank.bankapp.springbankapp.repository;

import com.shashank.bankapp.springbankapp.domain.entity.Role;
import com.shashank.bankapp.springbankapp.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @project spring-bank-app
 * @autor shashank on 2020-01-12
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByUsername(String username);
    Optional<User> findUserByEmail(String email);
}
