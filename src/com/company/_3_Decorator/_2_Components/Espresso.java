package com.company._3_Decorator._2_Components;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Most Excellent Espresso";
	}
  
	public double cost() {
		return 1.99 + super.cost();
	}
}

