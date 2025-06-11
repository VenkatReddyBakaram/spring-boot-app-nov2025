package com.vtechstorms.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.vtechstorms.service.MyConnection;

@Primary
@Service("oracle")
public class OracleConnection implements MyConnection {

	@Override
	public void connect() {
		System.out.println("connected to oracle database....!");
	}
}
