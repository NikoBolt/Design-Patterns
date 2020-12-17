package com.company._12_CombinePatterns._1._1_ducks;

	// Резиновая утка
public class RubberDuck implements Quackable {
	public void quack() {
		System.out.println("Squeak");
	}

	public String toString() {
		return "Rubber Duck";
	}
}
