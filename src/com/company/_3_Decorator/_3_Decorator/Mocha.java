package com.company._3_Decorator._3_Decorator;

public class Mocha extends CondimentDecorator {
//    Beverage beverage;  // в суперклассе

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
