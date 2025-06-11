package com.vtechstorms.service.impl;

import org.springframework.stereotype.Service;

import com.vtechstorms.service.Message;

@Service("english")
public class EnglishMessage implements Message {

	@Override
	public void message() {
		System.out.println("English Message");
	}
}
