package com.vtechstorms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.vtechstorms.beans.BeanComponent;
import com.vtechstorms.beans.BeanComponent2;
import com.vtechstorms.repository.TestRepository;

import jakarta.annotation.Resource;
import jakarta.inject.Inject;

@Service
public class TestService {

	@Value("${vems.app.mail}")
	private String mail;

	@Value("${vems.app.weburl}")
	private String weburl;

	@Autowired
	private TestRepository testRepository;

	@Autowired
	@Qualifier("postgres")
	private MyConnection myConnection;

	/* @Qualifier("english") */
	// @Autowired
	// @Qualifier("english")
	@Resource(name = "english")
	private Message message;

	/*
	 * @Autowired private LazyBean lazyBean;
	 */
	
	
	// @Autowired
	@Inject
	private BeanComponent beanComponent;

	@Autowired
	private BeanComponent2 beanComponent2;

	public void service() {
		myConnection.connect();
		message.message();
		beanComponent.beanComponent();
		beanComponent2.beanComponent2();
		testRepository.repository();
		System.out.println("Service");

		System.out.println("Mail :" + mail);
		System.out.println("Web URL :" + weburl);
	}
}
