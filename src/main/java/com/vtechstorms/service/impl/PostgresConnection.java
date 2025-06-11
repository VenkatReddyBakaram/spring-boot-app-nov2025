package com.vtechstorms.service.impl;

import org.springframework.stereotype.Service;

import com.vtechstorms.service.MyConnection;

@Service("postgres")
public class PostgresConnection implements MyConnection {

	@Override
	public void connect() {
		System.out.println("connected to postgres database....!");
	}
}