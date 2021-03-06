package com.tuturself.spring.springbootzuul.filters;

import com.netflix.zuul.ZuulFilter;

public class StudentErrorFilter extends ZuulFilter {

	@Override
	public Object run() {
		System.out.println("Error filter");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "error";
	}

}