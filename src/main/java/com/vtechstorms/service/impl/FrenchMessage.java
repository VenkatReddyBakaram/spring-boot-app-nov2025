package com.vtechstorms.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.vtechstorms.service.Message;

@Service("french")
@Primary
public class FrenchMessage implements Message {

	@Override
	public void message() {
		System.out.println("French Message");
	}
}
