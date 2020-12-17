package com.company._12_CombinePatterns._1._5_composite;

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
   
	public String toString() {
		return duck.toString();
	}
}
