package com.vtechstorms.service.impl;

import org.springframework.stereotype.Service;

import com.vtechstorms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String login(String userName, String password) {

		if (userName.equalsIgnoreCase(password))
			return "success";
		else
			return "failure";
	}

}
