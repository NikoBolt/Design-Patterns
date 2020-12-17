package com.company._12_CombinePatterns._1._5_composite;

// Адапрор для превращения гуся в утку
public class GooseAdapter implements Quackable {
	Goose goose;

		// Конструктор получает адаптируемого гуся
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

		// Вызов quack() делегируется методу honk() класса Goose
	public void quack() {
		goose.honk();
	}
 
	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
