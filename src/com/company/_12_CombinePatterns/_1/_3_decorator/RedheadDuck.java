package com.company._12_CombinePatterns._1._3_decorator;

	// Индоутка
public class RedheadDuck implements Quackable {
	public void quack() {
		System.out.println("Quack");
	}

	public String toString() {
		return "Redhead Duck";
	}
}
