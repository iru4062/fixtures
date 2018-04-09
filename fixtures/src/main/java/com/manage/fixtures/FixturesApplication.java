package com.manage.fixtures;

import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.ErrorPageFilter;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
public class FixturesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FixturesApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(FixturesApplication.class);//톰캣빌드 설정
	}
/*	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
		registry.addResourceHandler("/img/**").addResourceLocations("/img/");
	}*/

	@Bean
	public ErrorPageFilter errorPageFilter() {
		return new ErrorPageFilter();
	}
	
	@Bean
	public FilterRegistrationBean disabledSpringBootErrorFilter(ErrorPageFilter fillter) {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(fillter);
		filterRegistrationBean.setEnabled(false);
		return filterRegistrationBean;
	}
	
/*	@Bean                                                                                         
	public ServletRegistrationBean h2servletRegistration(){                                       
	    ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet()); 
	    registrationBean.addUrlMappings("/fixtures");
	    return registrationBean;                                                                  

	}   */         



}
