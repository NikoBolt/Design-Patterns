package com.company._12_CombinePatterns._1._6_observer;

// Резиновая утка
public class RubberDuck implements Quackable {

	// Каждая реализация Quackable (наблюдаЕМОГО) содержит объект Observable (наблюдаТЕЛЬ)
	Observable observable;	// Наблюдатель после создания в конструкторе имеет ссылку на этот объект

	public RubberDuck() {
		// Создаем новый объект Observable (наблюдаТЕЛЬ) и передаем ему объект MallardDuck (эту наблюдаЕМУЮ утку)
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Squeak");
		// Наблюдатели оповещаются о вызове quack()
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		// операция делегируется вспомогательному объекту
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		// операция делегируется вспомогательному объекту
		observable.notifyObservers();
	}
  
	public String toString() {
		return "Rubber Duck";
	}
}
