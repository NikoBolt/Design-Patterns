package com.company._3_Decorator._2_Components;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "Most Excellent House Blend Coffee";
	}
 
	public double cost() {
		return .89 + super.cost();
	}
}

