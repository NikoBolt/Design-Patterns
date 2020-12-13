package com.company._11_Proxy._5_Security_Proxy.Dynamyc_Proxy._5_2_javaproxy;

import java.lang.reflect.*;
import java.util.*;

public class MatchMakingTestDrive {
	// Переменные экземпляров
	HashMap<String, PersonBean> datingDB = new HashMap<String, PersonBean>();
 	
	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}
 
	public MatchMakingTestDrive() {
		initializeDatabase();
	}

	// Тестовый сценарий
	public void drive() {
		PersonBean joe = getPersonFromDatabase("Joe Javabean"); 	// Чтение записи
		PersonBean ownerProxy = getOwnerProxy(joe);						// Создание зама владельца
		System.out.println("Name is " + ownerProxy.getName());			// вызов get-метода
		ownerProxy.setInterests("bowling, Go");							// вызов set-метода
		System.out.println("Interests set from owner proxy");			//
		try {															// Получаем ошибку
			ownerProxy.setGeekRating(10);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getGeekRating());

		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);				// Создание зама посетителя
		System.out.println("Name is " + nonOwnerProxy.getName());		// вызов get-метода
		try {															//
			nonOwnerProxy.setInterests("bowling, Go");					// Получаем ошибку
		} catch (Exception e) {
			System.out.println("Can't set interests from non owner proxy");
		}
		nonOwnerProxy.setGeekRating(3);									// Задаем оценку
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getGeekRating());
	}

	// Динамическая генерация заместителя
		// Заместитель и реальный объект имеют одинаковые интерфейсы
	PersonBean getOwnerProxy(PersonBean person) {
 		
        return (PersonBean) Proxy.newProxyInstance( // Генерация прокси
            	person.getClass().getClassLoader(),	// передаем загрузчик класса реального объекта
            	person.getClass().getInterfaces(),	// + набор интерфейсов
                new OwnerInvocationHandler(person));// + обработчик вызова с сылкой на реальные объект
	}

	// Динамическая генерация заместителя
	// Заместитель и реальный объект имеют одинаковые интерфейсы
	PersonBean getNonOwnerProxy(PersonBean person) {
		
        return (PersonBean) Proxy.newProxyInstance(		// Генерация прокси
            	person.getClass().getClassLoader(),		// передаем загрузчик класса реального объекта
            	person.getClass().getInterfaces(),		// + набор интерфейсов
                new NonOwnerInvocationHandler(person));	// + обработчик вызова с сылкой на реальные объект
	}

	PersonBean getPersonFromDatabase(String name) {
		return (PersonBean)datingDB.get(name);
	}

	void initializeDatabase() {
		PersonBean joe = new PersonBeanImpl();
		joe.setName("Joe Javabean");
		joe.setInterests("cars, computers, music");
		joe.setGeekRating(7);
		datingDB.put(joe.getName(), joe);

		PersonBean kelly = new PersonBeanImpl();
		kelly.setName("Kelly Klosure");
		kelly.setInterests("ebay, movies, music");
		kelly.setGeekRating(6);
		datingDB.put(kelly.getName(), kelly);
	}
}
