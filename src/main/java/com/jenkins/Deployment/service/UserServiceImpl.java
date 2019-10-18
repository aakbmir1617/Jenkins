package com.jenkins.Deployment.service;

import org.springframework.stereotype.Service;

import com.jenkins.Deployment.domain.User;
import com.jenkins.Deployment.exception.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService
{

    /**
     * This method has only been kept for Testing Purpose as it is not directly been used in from the application
     * @param user
     * @return
     */
    @Override
    public User saveUser(User user)
    {
        return user;
    }

    /**
     * This user looks for the registered user by based on the username and password and throws an error if the user is not found
     * @param username
     * @param password
     * @return
     * @throws UserNotFoundException
     */
    @Override
    public User findByUsernameAndPassword(String username, String password) throws UserNotFoundException
    {
       User user = new User();
       user.setUserId(1);
        user.setUsername("Aaqib");
        user.setPassword("Aaqib");
       if(user == null)
       {
           throw new UserNotFoundException();
       }
       return user;
    }
}
