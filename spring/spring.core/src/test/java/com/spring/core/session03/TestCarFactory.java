package com.spring.core.session03;

import java.util.IntSummaryStatistics;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session03.beans.Car;
import com.spring.core.session03.beans.Clazz;
import com.spring.core.session03.beans.DBConn;
import com.spring.core.session03.beans.Teacher;

public class TestCarFactory {
	
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car1 = ctx.getBean("carfactory", Car.class);
		System.out.println(car1);
		Car car2 = ctx.getBean("carfactory", Car.class);
		System.out.println(car2);

		
	}
}
