package com.company._12_CombinePatterns._1._6_observer;

// Адапрор для превращения гуся в утку
public class GooseAdapter implements Quackable {
	Goose goose;

	// Каждая реализация Quackable (наблюдаЕМОГО) содержит объект Observable (наблюдаТЕЛЬ)
	Observable observable; // Наблюдатель после создания в конструкторе имеет ссылку на этот объект

	// Конструктор получает адаптируемого гуся
	public GooseAdapter(Goose goose) {
		this.goose = goose;

		// Создаем новый объект Observable (наблюдаТЕЛЬ) и передаем ему объект MallardDuck (эту наблюдаЕМУЮ утку)
		observable = new Observable(this);
	}

	// Вызов quack() делегируется методу honk() класса Goose
	public void quack() {
		goose.honk();

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
		return "Goose pretending to be a Duck";
	}
}
