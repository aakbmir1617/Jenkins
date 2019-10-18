package com.jenkins.Deployment.service;

import java.util.Map;

import com.jenkins.Deployment.domain.User;

public interface SecurityTokenGenerator
{
    Map<String,String> generateToken(User user);
}
