package com.spring.core.session03.beans;

public class DBConn {
	public void init() {
		System.out.println("init");
	}
	
	public void query() {
		System.out.println("query");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
}
