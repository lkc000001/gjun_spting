package com.spring.core.session02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session01.beans.Hello;
import com.spring.core.session02.beans.Author;
import com.spring.core.session02.beans.Book;
import com.spring.core.session02.beans.Lotto;
import com.spring.core.session02.beans.Paper;

public class TestPaper {
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Paper paper1 = ctx.getBean("paper1", Paper.class);
		//System.out.println(paper1);
		Paper paper2 = ctx.getBean("paper2", Paper.class);
		System.out.println(paper2);
		
		Paper paper4 = ctx.getBean("paper4", Paper.class);
		System.out.println(paper4);
	}
}
