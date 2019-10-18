package com.jenkins.Deployment.service;

import com.jenkins.Deployment.domain.User;
import com.jenkins.Deployment.exception.UserNotFoundException;

public interface UserService
{
    public User saveUser(User user);
    public User findByUsernameAndPassword(String username,String password) throws UserNotFoundException;
}
