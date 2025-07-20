package com.vtechstorms.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	DependentService dependentService;

	public MyService(DependentService dependentService) {
		this.dependentService = dependentService;
	}

	/*
	 * //setter injection public void setDependentService(DependentService
	 * dependentService) { this.dependentService = dependentService; }
	 * 
	 * public DependentService getDependentService() { return this.dependentService;
	 * }
	 */

	public void testMyService() {
		dependentService.testDependentService();
		privateService();
	}

	private void privateService() {
		System.out.println("Private SErvice");
	}

}
