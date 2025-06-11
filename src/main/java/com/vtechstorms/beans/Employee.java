package com.vtechstorms.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empl")
public class Employee {

	@Autowired
	private Address address;

	public void employee() {
		System.out.println("Employee");
		address.address();
	}
}
