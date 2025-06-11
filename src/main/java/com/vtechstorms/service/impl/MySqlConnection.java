package com.vtechstorms.service.impl;

import org.springframework.stereotype.Service;

import com.vtechstorms.service.MyConnection;

@Service("mysql")
public class MySqlConnection implements MyConnection {

	@Override
	public void connect() {
		System.out.println("connected to mysql database..!");
	}
}
