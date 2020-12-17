package com.company._12_CombinePatterns._1._6_observer;

	// Чтобы Quackable можно было бы наблюдать
public interface QuackObservable {
		// Регистрация наблюдателей
	public void registerObserver(Observer observer);
		// Оповещение наблюдателей
	public void notifyObservers();
}
