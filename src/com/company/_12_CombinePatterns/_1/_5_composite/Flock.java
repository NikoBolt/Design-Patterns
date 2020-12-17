package com.company._12_CombinePatterns._1._5_composite;

import java.util.Iterator;
import java.util.ArrayList;

	// Компановщик
public class Flock implements Quackable {
		// Спимок реализаций, входящих в стаю
	ArrayList<Quackable> quackers = new ArrayList<Quackable>();

		// Добавление реализации к стае
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
 
	public void quack() {
			// Перебор всех quack() стаи
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}
	}
 
	public String toString() {
		return "Flock of Quackers";
	}
}
