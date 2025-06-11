package com.vtechstorms.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ProtoTypeBean {

	public ProtoTypeBean() {
		System.out.println("Prototype bean object is created...!");
	}
}
