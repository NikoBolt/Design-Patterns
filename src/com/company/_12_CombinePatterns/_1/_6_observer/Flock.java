package com.company._12_CombinePatterns._1._6_observer;

import java.util.Iterator;
import java.util.*;

	// Компановщик
public class Flock implements Quackable {
		// Спимок реализаций, входящих в стаю
	List<Quackable> ducks = new ArrayList<Quackable>();

		// Добавление реализации к стае
	public void add(Quackable duck) {
		ducks.add(duck);
	}
  
	public void quack() {
		// Перебор всех quack() стаи
		// Наблюдатели оповещаются о вызове quack()
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}
   
	public void registerObserver(Observer observer) {
		// операция делегируется вспомогательному объекту
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}

		// У каждой утки своя реализация оповещения
	public void notifyObservers() { }
  
	public String toString() {
		return "Flock of Ducks";
	}
}
