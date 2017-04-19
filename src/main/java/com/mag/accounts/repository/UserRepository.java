package com.mag.accounts.repository;

import com.mag.accounts.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Nelth on 2017-04-16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}