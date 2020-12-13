package com.company._11_Proxy._5_Security_Proxy.Dynamyc_Proxy._5_2_javaproxy;
 
import java.lang.reflect.*;
 
public class OwnerInvocationHandler implements InvocationHandler { 
	PersonBean person;

	// Передаем реальный объект
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	// При вызове метода заместителя вызывается метод invoke
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws IllegalAccessException {
  
		try {
			if (method.getName().startsWith("get")) { 	// пердается реальному объекту
				return method.invoke(person, args);
   			} else if (method.getName().equals("setGeekRating"))
   			{											// БЛОКИРУЕТСЯ для владельца
				throw new IllegalAccessException();
			} else if (method.getName().startsWith("set")) {// пердается реальному объекту
				return method.invoke(person, args);
			} 
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;	// при вызове других методов
	}
}
