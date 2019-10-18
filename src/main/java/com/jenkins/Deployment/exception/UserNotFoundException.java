package com.jenkins.Deployment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND , reason = "Your username and/or password do not match!!!")
public class UserNotFoundException extends Exception
{

}
