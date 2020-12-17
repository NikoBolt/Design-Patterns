package com.company._12_CombinePatterns._1._6_observer;

// Декоратор
public class QuackCounter implements Quackable {
	Quackable duck;				// Хранится декорируемый объект
	static int numberOfQuacks;
  
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
  
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	public static int getQuacks() {
		return numberOfQuacks;
	}
 
	public void registerObserver(Observer observer) {
			// операция делегируется вспомогательному объекту
		duck.registerObserver(observer);
	}
 
	public void notifyObservers() {
			// операция делегируется вспомогательному объекту
		duck.notifyObservers();
	}
   
	public String toString() {
		return duck.toString();
	}
}
