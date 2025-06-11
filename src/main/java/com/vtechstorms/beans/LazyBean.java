package com.vtechstorms.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class LazyBean {
	public LazyBean() {
		System.out.println("Lazy Bean is Created on Demand");
	}
}
