package com.mag.accounts.service;

import com.mag.accounts.entities.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Nelth on 2017-04-16.
 */

public interface UserService {
    void save(User user);

    User findByUsername(String username);

}
