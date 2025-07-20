package com.vtechstorms.service;

import org.springframework.stereotype.Service;

@Service
public class DependentService {

	void testDependentService() {
		System.out.println("Dependent Service");
	}
}
