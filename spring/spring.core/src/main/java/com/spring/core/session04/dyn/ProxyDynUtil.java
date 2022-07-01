package com.spring.core.session04.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyDynUtil {
	private Object object;

	public ProxyDynUtil(Object object) {
		this.object = object;
	}
	
	public Object getPrioxy() {
		Object proxyObj = null;
		
		ClassLoader loader = object.getClass().getClassLoader();
		Class[] interfaces = object.getClass().getInterfaces();
		InvocationHandler InvocationHandler = (proxy, method, args) -> {
			Object result = null;
			System.out.println("Before ");
			result = method.invoke(object, args);
			return result;
		};
		proxyObj = Proxy.newProxyInstance(loader, interfaces, InvocationHandler);
		return proxyObj;	
	}
	
}
