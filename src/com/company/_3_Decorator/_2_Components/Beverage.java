package com.company._3_Decorator._2_Components;

public abstract class Beverage {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}

	boolean milk;
	boolean soy;
	boolean mocha;
	boolean whip;

	double milkCost = 0.1;
	double soyCost = 0.15;
	double mochaCost = 0.2;
	double whipCost = 0.1;

	public boolean hasMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean hasSoy() {
		return soy;
	}

	public void setSoy(boolean soy) {
		this.soy = soy;
	}

	public boolean hasMocha() {
		return mocha;
	}

	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}

	public boolean hasWhip() {
		return whip;
	}

	public void setWhip(boolean whip) {
		this.whip = whip;
	}

	public /*abstract*/ double cost() {
		double condimentCost = 0.0;
		if (hasMilk()) condimentCost += milkCost;
		if (hasSoy()) condimentCost += soyCost;
		if (hasMocha()) condimentCost += mochaCost;
		if (hasWhip()) condimentCost += whipCost;
		return condimentCost;
	}
}
