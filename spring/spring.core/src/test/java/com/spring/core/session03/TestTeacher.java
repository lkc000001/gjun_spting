package com.spring.core.session03;

import java.util.IntSummaryStatistics;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.session01.beans.Hello;
import com.spring.core.session02.beans.Author;
import com.spring.core.session02.beans.Book;
import com.spring.core.session02.beans.Lotto;
import com.spring.core.session03.beans.Clazz;
import com.spring.core.session03.beans.Student;
import com.spring.core.session03.beans.Teacher;

public class TestTeacher {
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Teacher teacher1 = ctx.getBean("teacher1", Teacher.class);
		System.out.println(teacher1);
		teacher1.getStudents().stream()
			.map(s -> s.getClazzs())
			.forEach(s -> {
				int sum =  s.stream().mapToInt(Clazz::getCredit).sum();
				double avg = s.stream().mapToInt(Clazz::getCredit).average().getAsDouble();
				System.out.println(sum + "," + avg);
				IntSummaryStatistics stat = s.stream().mapToInt(Clazz::getCredit).summaryStatistics();
				System.out.println(stat);
			});
			
		Teacher teacher2 = ctx.getBean("teacher2", Teacher.class);
		System.out.println(teacher2);
	}
}
