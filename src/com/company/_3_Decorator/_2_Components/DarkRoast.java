package com.company._3_Decorator._2_Components;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Most Excellent Dark Roast";
	}
 
	public double cost() {
		return 0.99 + super.cost();
	}
}

