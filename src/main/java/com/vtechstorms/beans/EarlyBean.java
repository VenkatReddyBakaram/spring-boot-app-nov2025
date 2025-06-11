package com.vtechstorms.beans;

import org.springframework.stereotype.Component;

@Component
public class EarlyBean {

	public EarlyBean() {
		System.out.println("Early Bean is Created when Start-up");
	}
}
