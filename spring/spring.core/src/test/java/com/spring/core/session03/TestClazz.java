package com.spring.core.session03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session01.beans.Hello;
import com.spring.core.session02.beans.Author;
import com.spring.core.session02.beans.Book;
import com.spring.core.session02.beans.Lotto;
import com.spring.core.session03.beans.Clazz;

public class TestClazz {
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Clazz clazz = ctx.getBean("clazz1", Clazz.class);
		System.out.println(clazz);
		
	}
}
