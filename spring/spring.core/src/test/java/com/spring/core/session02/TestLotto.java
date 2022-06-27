package com.spring.core.session02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session01.beans.Hello;
import com.spring.core.session02.beans.Lotto;

public class TestLotto {
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Lotto lotto1 = ctx.getBean(Lotto.class);
		//System.out.println(lotto1);
		Lotto lotto2 = ctx.getBean("Lotto", Lotto.class);
		System.out.println(lotto2);
	}
}
