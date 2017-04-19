package com.mag.accounts.service;

import com.mag.accounts.entities.Role;
import com.mag.accounts.entities.User;
import com.mag.accounts.repository.RoleRepository;
import com.mag.accounts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nelth on 2017-04-16.
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private UserService userService;

    //@Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        //TODO: zastap set pojedynczym id roli
        Set<Role> roleTmp = new HashSet<Role>();
        roleTmp.add(roleRepository.findOne(user.getRoleId()));
        user.setRoles(roleTmp);

        userRepository.save(user);
    }

    //@Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
