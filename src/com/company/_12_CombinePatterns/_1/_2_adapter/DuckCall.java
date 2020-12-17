package com.company._12_CombinePatterns._1._2_adapter;

	// Утиный свисток-приманка
public class DuckCall implements Quackable {
	public void quack() {
		System.out.println("Kwak");
	}

	public String toString() {
		return "Duck Call";
	}
}
