package com.company._12_CombinePatterns._1._1_ducks;

	// Деревянная утка-игрушка
public class DecoyDuck implements Quackable {
	public void quack() {
		System.out.println("<< Silence >>");
	}

	public String toString() {
		return "Decoy Duck";
	}
}
