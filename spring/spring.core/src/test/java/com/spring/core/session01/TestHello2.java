package com.spring.core.session01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session01.beans.Hello;
import com.spring.core.session01.conf.SpringConfig;

public class TestHello2 {
	
	@Test
	public void test() {
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = ctx.getBean(Hello.class);
		System.out.println(hello);
		
		Hello hello2 = ctx.getBean("hello", Hello.class);
		System.out.println(hello2);*/

		ApplicationContext ctx2 = new AnnotationConfigApplicationContext(SpringConfig.class);
		Hello hello3 = ctx2.getBean(Hello.class);
		Hello hello4 = ctx2.getBean("hello", Hello.class);
		System.out.println(hello3);
		System.out.println(hello4);
	}
}
