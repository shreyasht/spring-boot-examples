package com.tuturself.spring.springbootzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.tuturself.spring.springbootzuul.filters.StudentErrorFilter;
import com.tuturself.spring.springbootzuul.filters.StudentPostFilter;
import com.tuturself.spring.springbootzuul.filters.StudentPreFilter;
import com.tuturself.spring.springbootzuul.filters.StudentRouteFilter;

@EnableZuulProxy
@SpringBootApplication
public class SpringBootZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulApplication.class, args);
	}

	@Bean
	public StudentPreFilter preFilter(){
		return new StudentPreFilter();
	}
	
	@Bean
	public StudentPostFilter postFilter(){
		return new StudentPostFilter();
	}
	
	@Bean
	public StudentRouteFilter routeFilter(){
		return new StudentRouteFilter();
	}

	@Bean
	public StudentErrorFilter errorFilter(){
		return new StudentErrorFilter();
	}
	
}
