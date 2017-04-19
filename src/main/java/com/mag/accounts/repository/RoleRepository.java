package com.mag.accounts.repository;

import com.mag.accounts.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Nelth on 2017-04-16.
 */

public interface RoleRepository extends JpaRepository<Role, Long>{
}