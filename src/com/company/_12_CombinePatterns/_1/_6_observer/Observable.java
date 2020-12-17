package com.company._12_CombinePatterns._1._6_observer;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

	// Реализует всю функциональность, необходимую Quackable для наблюдения
public class Observable implements QuackObservable {
		// Список наблюдаТЕЛЕЙ
	List<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;

		// Передается объект QuackObservable (наблюдаЕМЫЙ),
		// который используется им (наблюдаТЕЛЕМ) для управления наблюдением.
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

		// Регистрация наблюдаТЕЛЯ
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  		// При оповещении Observable(наблюдаТЕЛЬ) передает объект duck,
		// чтобы наблюдаТЕЛЬ знал, в каком объекте произошло наблюдаемое событие
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}
 
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}
