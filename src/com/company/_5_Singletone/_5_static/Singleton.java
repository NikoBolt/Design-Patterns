package com.company._5_Singletone._5_static;

public class Singleton {
	// Создаем заранее
	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static /* синхронизация замедляет код в 100 и более раз */ synchronized /**/ Singleton getInstance() {
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
