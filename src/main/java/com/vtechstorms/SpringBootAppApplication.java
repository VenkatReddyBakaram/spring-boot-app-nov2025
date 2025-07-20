package com.vtechstorms;

import com.vtech.TestComponent1;
import com.vtechstorms.beans.*;
import com.vtechstorms.service.MyService;
import com.vtechstorms.service.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.vtech", "com.vtechstorms" })
public class SpringBootAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootAppApplication.class, args);

		/*
		 * TestBean testBean = new TestBean(); testBean.testBean();
		 */

		MyService myService = context.getBean(MyService.class);
		myService.testMyService();

		TestBean testBean = context.getBean(TestBean.class); // type casting is not required
		testBean.testBean();

		// Employee employee = context.getBean(Employee.class);
		Object object = context.getBean("empl");
		Employee employee = (Employee) object; // typecasting is required
		employee.employee();

		Address address = context.getBean(Address.class);
		address.address();

		TestComponent1 testComponent1 = context.getBean(TestComponent1.class);
		testComponent1.testComponent();

		TestComponent testComponent = context.getBean(TestComponent.class);
		testComponent.testComponent();

		TestService testService = context.getBean(TestService.class);
		testService.service();

		context.getBean(SingletonBean.class);
		context.getBean(SingletonBean.class);
		// SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
		context.getBean(SingletonBean.class);

		// ProtoTypeBean protoTypeBean1 = context.getBean(ProtoTypeBean.class);
		context.getBean(ProtoTypeBean.class);
		context.getBean(ProtoTypeBean.class);
		context.getBean(ProtoTypeBean.class);
	}

	@Bean
	// public BeanComponent2 getBeanComponent2() {
	BeanComponent2 getBeanComponent2() {
		return new BeanComponent2();
	}
}
