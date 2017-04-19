package com.mag.accounts.service;

/**
 * Created by Nelth on 2017-04-16.
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}