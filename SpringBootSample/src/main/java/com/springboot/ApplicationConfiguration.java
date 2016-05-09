package com.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class ApplicationConfiguration extends WebMvcConfigurerAdapter{

	
	 @Bean
	     public InternalResourceViewResolver viewResolver() {
	         InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	         resolver.setPrefix("WEB-INF/views/");
	         resolver.setSuffix(".jsp");
	         return resolver;
	     }

}
