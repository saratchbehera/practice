package com.sarat.designPatterns.structural_Design_Patterns.Proxy;
		
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalInvocationHandler implements InvocationHandler {
	
	private Object realSubject = null;
	
	public AnimalInvocationHandler(Object realSubject) {
		this.realSubject = realSubject;
	}

	public Object invoke(Object proxy, Method m, Object[] args) {
	
		Object result = null;
		
		try {
			result = m.invoke(realSubject, args);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
}