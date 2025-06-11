package com.vtechstorms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.vtechstorms.beans.BeanComponent;

@Configuration
public class AppConfig {

	@Bean
	BeanComponent getBeanComponent() {
		return new BeanComponent();
	}

	@Bean
	ModelAndView getModelAndView() {
		return new ModelAndView();
	}
}
