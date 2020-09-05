package com.company._3_Decorator._2_Components;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Most Excellent Decaf Coffee";
	}
 
	public double cost() {
		return 1.05 + super.cost();
	}
}

