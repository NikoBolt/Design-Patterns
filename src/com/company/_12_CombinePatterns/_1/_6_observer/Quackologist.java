package com.company._12_CombinePatterns._1._6_observer;

	// НаблюдаТЕЛЬ
public class Quackologist implements Observer {

		// Выводит информацию о реализации Quackable (наблюдаЕМОГО), от которой поступило оповещение
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	public String toString() {
		return "Quackologist";
	}
}
