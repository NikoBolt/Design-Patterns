package com.company._12_CombinePatterns._1._2_adapter;

// Утка-кряква
public class MallardDuck implements Quackable {
	public void quack() {
		System.out.println("Quack");
	}

	public String toString() {
		return "Mallard Duck";
	}
}
