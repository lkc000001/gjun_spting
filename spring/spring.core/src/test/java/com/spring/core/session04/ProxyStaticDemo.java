package com.spring.core.session04;

import java.util.IntSummaryStatistics;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session03.beans.Clazz;
import com.spring.core.session03.beans.Teacher;
import com.spring.core.session04.sta.Man;
import com.spring.core.session04.sta.Person;
import com.spring.core.session04.sta.PersonProxy;
import com.spring.core.session04.sta.Woman;

public class ProxyStaticDemo {
	@Test
	public void test() {
		/*Person man = new Man();
		Person woman = new Woman();
		man.work();
		woman.work();*/
		
		Person man = new PersonProxy(new Man());
		Person woman = new PersonProxy(new Woman());
		man.work();
		woman.work();
	}
}
