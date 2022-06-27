package com.spring.core.session02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session01.beans.Hello;
import com.spring.core.session02.beans.Author;
import com.spring.core.session02.beans.Lotto;

public class TestAuthor {
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Author author1 = ctx.getBean("author2", Author.class);
		System.out.println(author1);
		Author author2 = ctx.getBean("author3", Author.class);
		System.out.println(author2);
		Author author3 = ctx.getBean("author4", Author.class);
		System.out.println(author3);
		Author author4 = ctx.getBean("author5", Author.class);
		System.out.println(author4);
	}
}
