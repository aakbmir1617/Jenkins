package com.jenkins.Deployment.serviceTest;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.jenkins.Deployment.domain.User;
import com.jenkins.Deployment.exception.UserNotFoundException;
import com.jenkins.Deployment.service.UserServiceImpl;

public class UserServiceTest {

	private User user;

	@InjectMocks
	private UserServiceImpl userService;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		user = new User();
		user.setUsername("Ricky");
		user.setPassword("Ricky123");
	}

	@Test
	public void testSaveUserSuccess() {
		System.out.println("in testSaveUserSuccess");
	}

	@Test
	public void testUserLoginSuccess() throws UserNotFoundException {
		System.out.println("in testUserLoginSuccess");
	}
}