package com.spring.core.session04;

import org.junit.Test;

import com.spring.core.session04.dyn.Calc;
import com.spring.core.session04.dyn.CalcImpl;
import com.spring.core.session04.dyn.ProxyDynUtil;
import com.spring.core.session04.sta.Man;
import com.spring.core.session04.sta.Person;
import com.spring.core.session04.sta.PersonProxy;
import com.spring.core.session04.sta.Woman;

public class ProxyDynDemo {
	@Test
	public void test() {
		Calc calc = (Calc) new ProxyDynUtil(new CalcImpl()).getPrioxy();
		System.out.println(calc.add(20, 10));
		System.out.println(calc.div(20, 10));
		
		Person man = (Person) new ProxyDynUtil(new Man()).getPrioxy();
		man.work();
	}
}
