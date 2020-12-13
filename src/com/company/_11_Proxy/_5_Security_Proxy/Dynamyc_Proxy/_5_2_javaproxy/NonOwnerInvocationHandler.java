package com.company._11_Proxy._5_Security_Proxy.Dynamyc_Proxy._5_2_javaproxy;
 
import java.lang.reflect.*;
 
public class NonOwnerInvocationHandler implements InvocationHandler { 
	PersonBean person;

	// Передаем реальный объект
	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	// При вызове метода заместителя вызывается метод invoke
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws IllegalAccessException {
  
		try {
			if (method.getName().startsWith("get")) {	// пердается реальному объекту
				return method.invoke(person, args);
   			} else if (method.getName().equals("setGeekRating")) {	// пердается реальному объекту
				return method.invoke(person, args);
			} else if (method.getName().startsWith("set"))
			{											// БЛОКИРУЕТСЯ для других пользователей
				throw new IllegalAccessException();
			} 
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}
}
